package com.example.pokeapirecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorImagen extends RecyclerView.Adapter<AdaptadorImagen.ViewHolder>{
    List<String> ListaImagenesPokemon;
    public AdaptadorImagen(List<String> lista) {

        this.ListaImagenesPokemon = lista;
    }


    @NonNull
    @Override
    public AdaptadorImagen.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new AdaptadorImagen.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorImagen.ViewHolder holder, int position) {
        String temporal = ListaImagenesPokemon.get(position);
        holder.cargarDatos(temporal);

    }

    @Override
    public int getItemCount() {
        return ListaImagenesPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagenPokemon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenPokemon= itemView.findViewById(R.id.imagenPokemon);
        }
        public void cargarDatos(String datos) {
            Picasso.get().load(datos).into(imagenPokemon);
        }
    }
}