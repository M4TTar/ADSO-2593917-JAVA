package com.example.pokeapirecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorHabilidades extends RecyclerView.Adapter<AdaptadorHabilidades.ViewHolder>{

    List<HabilidadesPokemon> ListaHabilidadesPokemon;
    public AdaptadorHabilidades(List<HabilidadesPokemon> lista) {

        this.ListaHabilidadesPokemon = lista;
    }

    @NonNull
    @Override
    public AdaptadorHabilidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detalles, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHabilidades.ViewHolder holder, int position) {
        HabilidadesPokemon temporal = ListaHabilidadesPokemon.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return ListaHabilidadesPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView habiPokemon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            habiPokemon= itemView.findViewById(R.id.habiPokemon);
        }

        public void cargarDatos(HabilidadesPokemon datos) {
            habiPokemon.setText(datos.getHabilidades());
        }
    }
}
