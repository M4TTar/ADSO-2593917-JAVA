package com.example.pokeapirecycler;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PokemonResponse {

    private int id;
    private String name;
    private List<Ability> abilities;
    private int height;
    private int weight;
    public static class Ability {
        private String name;

        public String getName() {
            return name;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
