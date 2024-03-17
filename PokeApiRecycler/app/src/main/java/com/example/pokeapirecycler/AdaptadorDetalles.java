package com.example.pokeapirecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorDetalles extends RecyclerView.Adapter<AdaptadorDetalles.ViewHolder> {
    Pokemon pokemon;

    public AdaptadorDetalles(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_pokemon, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorDetalles.ViewHolder holder, int position) {
        holder.alturaDetalles.setText(String.format("%.1f m", pokemon.getHeight() / 10.0));
        holder.pesoDetalles.setText(String.format("%.1f kg", pokemon.getWeight() / 10.0));
        List<PokemonResponse.Ability> abilities = pokemon.getAbilities();
        if (!abilities.isEmpty()) {
            holder.abilitiesRecyclerView.setAdapter(new AdaptadorHabilidades(abilities));
            holder.abilitiesRecyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        } else {
            // Si la lista de habilidades está vacía, muestra un mensaje de que no hay habilidades
            holder.abilitiesRecyclerView.setVisibility(View.GONE);
            holder.noAbilitiesTextView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return 1; // Solo habrá un elemento en la vista de detalles
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView alturaDetalles;
        public TextView pesoDetalles;
        public RecyclerView abilitiesRecyclerView;
        public TextView noAbilitiesTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            alturaDetalles = itemView.findViewById(R.id.alturaDetalles);
            pesoDetalles = itemView.findViewById(R.id.pesoDetalles);
            abilitiesRecyclerView = itemView.findViewById(R.id.abilitiesRecyclerView);
            noAbilitiesTextView = itemView.findViewById(R.id.noAbilitiesTextView);
        }
    }
}

