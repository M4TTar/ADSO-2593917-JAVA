package com.example.pokeapirecycler;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.URL;
import java.util.List;
public class Pokemon implements Parcelable {

    private int number;
    private String name;
    private List<PokemonResponse.Ability> abilities;
    private List<String> abilitiesNames;
    private int height;
    private int weight;
    URL spriteUrl;

    public Pokemon(int id, String name, List<String> abilitiesNames) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public List<String> getAbilitiesNames() {
        return abilitiesNames;
    }

    public void setAbilitiesNames(List<String> abilitiesNames) {
        this.abilitiesNames = abilitiesNames;
    }

    public URL getSpriteUrl() {
        return spriteUrl;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(name);
    }

    public static final Creator<Pokemon> CREATOR = new Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel in) {
            return new Pokemon(in);
        }

        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };

    private Pokemon(Parcel in) {
        number = in.readInt();
        name = in.readString();
    }

    private PokemonClickListener clickListener;

    public PokemonClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(PokemonClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface PokemonClickListener {
        void onPokemonClick(Pokemon pokemon);
    }

    public Pokemon(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public List<PokemonResponse.Ability> getAbilities() {
        return abilities;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
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
