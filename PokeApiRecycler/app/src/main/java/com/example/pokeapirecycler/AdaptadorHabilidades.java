package com.example.pokeapirecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorHabilidades extends RecyclerView.Adapter<AdaptadorHabilidades.ViewHolder> {
    private List<PokemonResponse.Ability> abilities;

    public AdaptadorHabilidades(List<PokemonResponse.Ability> abilities) {
        this.abilities = abilities;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detalles, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.habiPokemon.setText(abilities.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return abilities.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView habiPokemon;

        public ViewHolder(View itemView) {
            super(itemView);
            habiPokemon = itemView.findViewById(R.id.habiPokemon);
        }
    }
}
