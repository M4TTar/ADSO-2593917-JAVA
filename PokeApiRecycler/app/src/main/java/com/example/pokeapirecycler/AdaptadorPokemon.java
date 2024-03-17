package com.example.pokeapirecycler;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AdaptadorPokemon extends RecyclerView.Adapter<AdaptadorPokemon.ViewHolder> {
    List<Pokemon> listaPokemon;
    Context contexto; // Declarar la variable contexto

    public AdaptadorPokemon(List<Pokemon> listaPokemon, Context contexto) { // Agregar el contexto como parámetro en el constructor
        this.listaPokemon = listaPokemon;
        this.contexto = contexto; // Asignar el contexto recibido al contexto del adaptador
        for (Pokemon pokemon : listaPokemon) {
            pokemon.setClickListener(new Pokemon.PokemonClickListener() {
                @Override
                public void onPokemonClick(Pokemon pokemon) {
                    // Aquí puedes manejar el evento de clic. Por ejemplo, puedes iniciar una nueva Actividad para mostrar los detalles del Pokémon.
                    Intent intent = new Intent(contexto, DetallesPokemon.class);
                    intent.putExtra("pokemon", pokemon);
                    contexto.startActivity(intent);
                }
            });
        }
    }

    @NonNull
    @Override
    public AdaptadorPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPokemon.ViewHolder holder, int position) {
        Pokemon pokemon = listaPokemon.get(position);
        holder.idPokemon.setText(String.format("%04d", pokemon.getNumber()));
        holder.nombrePokemon.setText(pokemon.getName());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(contexto, DetallesPokemon.class);
            intent.putExtra(DetallesPokemon.EXTRA_POKEMON, pokemon);
            contexto.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listaPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView idPokemon;
        public TextView nombrePokemon;
        public ImageView imgPokemon;

        public ViewHolder(View itemView) {
            super(itemView);
            idPokemon = itemView.findViewById(R.id.idPokemon);
            nombrePokemon = itemView.findViewById(R.id.nombrePokemon);
            imgPokemon = itemView.findViewById(R.id.imgPokemon);
        }
    }
}
