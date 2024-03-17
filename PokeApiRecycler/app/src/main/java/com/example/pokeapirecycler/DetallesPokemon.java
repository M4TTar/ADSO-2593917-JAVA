package com.example.pokeapirecycler;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DetallesPokemon extends AppCompatActivity {

    public static final String EXTRA_POKEMON = "pokemon";

    private AdaptadorDetalles adaptadorDetalles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_pokemon);

        Pokemon pokemon = getIntent().getParcelableExtra(EXTRA_POKEMON);

        // Set the Pokemon details in the UI
        TextView nombreDetalles = findViewById(R.id.nombreDetalles);
        ImageView imgDetalles = findViewById(R.id.imgDetalles);
        assert pokemon != null;
        nombreDetalles.setText(pokemon.getName());

        // Set up the adapter for the Pokemon details
        List<Pokemon> listaPokemon = new ArrayList<>();
        listaPokemon.add(pokemon);
        adaptadorDetalles = new AdaptadorDetalles(pokemon);

        // Set up the RecyclerView for the abilities
        RecyclerView abilitiesRecyclerView = findViewById(R.id.abilitiesRecyclerView);
        abilitiesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        abilitiesRecyclerView.setAdapter(adaptadorDetalles);
    }
}
