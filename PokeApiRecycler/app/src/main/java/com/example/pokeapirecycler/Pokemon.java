package com.example.pokeapirecycler;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.URL;
import java.util.List;

public class Pokemon {

    private int number;
    String nombre;

    String url;
    int id_pokemon;

    public Pokemon(String nombre, String url, int id_pokemon) {
        this.nombre = nombre;
        this.url = url;
        this.id_pokemon = id_pokemon;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public int getId_pokemon() {

        return id_pokemon;
    }

    public void setId_pokemon(int id_pokemon) {

        this.id_pokemon = id_pokemon;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        if (number < 10) {
            this.number = 0000 + number;
        } else if (number < 999) {
            this.number = 000 + number;
        } else {
            this.number = number;
        }
    }
}