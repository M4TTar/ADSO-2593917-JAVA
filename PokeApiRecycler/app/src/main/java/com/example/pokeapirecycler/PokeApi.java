package com.example.pokeapirecycler;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.converter.gson.GsonConverterFactory;

public interface PokeApi {

    @GET("pokemon")
    Call<ListaPoke> getPokemonList(@Query("limit") int limit, @Query("offset") int offset);

    @GET("pokemon/{name}")
    Call<PokemonResponse> getPokemon(@Path("name") String name);

    @GET("pokemon-species/{name}")
    Call<SpeciesPokemon> getPokemonSpecies(@Path("name") String name);

    @GET("pokemon/{id}")
    Call<PokemonResponse> getPokemonById(@Path("id") int id);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("pokemon/{id}/sprites")
    Call<SpritesPokemon> getPokemonSprites(@Path("id") int id);

    @GET("pokemon/{id}/")
    Call<ResponseBody> getPokemonImage(@Path("id") int id);
}
