package com.example.pokeapirecycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView pokemonList;
    private AdaptadorPokemon pokemonAdapter;
    private List<Pokemon> pokemonListToAdd;
    private Button btnAnterior;
    private Button btnSiguiente;
    private int offset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pokemonList = findViewById(R.id.recyclar_pokemons);
        pokemonList.setLayoutManager(new LinearLayoutManager(this));
        pokemonListToAdd = new ArrayList<>();
        pokemonAdapter = new AdaptadorPokemon(pokemonListToAdd, this);
        pokemonList.setAdapter(pokemonAdapter);
        btnAnterior = findViewById(R.id.btnAnterior);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        btnAnterior.setEnabled(false);
        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (offset > 0) {
                    offset -= 20;
                    pokemonListToAdd.clear();
                    fetchPokemon();
                    btnAnterior.setEnabled(offset > 0);
                }
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                offset += 20;
                pokemonListToAdd.clear();
                fetchPokemon();
                btnAnterior.setEnabled(true);
            }
        });

        fetchPokemon();
    }

    private void fetchPokemon() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PokeApi service = retrofit.create(PokeApi.class);

        Call<ListaPoke> call = service.getPokemonList(20, offset);
        call.enqueue(new Callback<ListaPoke>() {
            @Override
            public void onResponse(Call<ListaPoke> call, Response<ListaPoke> response) {
                if (response.isSuccessful()) {
                    List<ListaPoke.ResultsItem> results = response.body().getResults();
                    List<Pokemon> pokemonToAdd = new ArrayList<>();
                    final int[] counter = {0};
                    for (ListaPoke.ResultsItem result : results) {
                        Call<PokemonResponse> pokemonCall = service.getPokemon(result.getName());
                        pokemonCall.enqueue(new Callback<PokemonResponse>() {
                            @Override
                            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {if (response.isSuccessful()) {
                                PokemonResponse pokemonResponse = response.body();
                                Pokemon pokemon = new Pokemon(pokemonResponse.getId(), pokemonResponse.getName());
                                pokemon.setNumber(pokemon.getNumber());
                                pokemonToAdd.add(pokemon);
                                counter[0]++;
                                if (counter[0] == results.size()) {
                                    pokemonListToAdd.addAll(pokemonToAdd);
                                    Collections.sort(pokemonListToAdd, new Comparator<Pokemon>() {
                                        @Override
                                        public int compare(Pokemon p1, Pokemon p2) {
                                            return Integer.compare(p1.getNumber(), p2.getNumber());
                                        }
                                    });
                                    pokemonAdapter.notifyDataSetChanged();

                                    // Enable or disable the "Anterior" button
                                    btnAnterior.setEnabled(offset > 0);

                                    // Disable the "Siguiente" button if it's the last page
                                    if (results.size() < 20) {
                                        btnSiguiente.setEnabled(false);
                                    } else {
                                        btnSiguiente.setEnabled(true);
                                    }
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "Error fetching Pokémon data", Toast.LENGTH_SHORT).show();
                            }
                            }

                            @Override
                            public void onFailure(Call<PokemonResponse> call, Throwable t) {
                                Toast.makeText(MainActivity.this, "Error fetching Pokémon data", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Error fetching Pokémon list", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ListaPoke> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error fetching Pokémon list", Toast.LENGTH_SHORT).show();
            }
        });
    }
}