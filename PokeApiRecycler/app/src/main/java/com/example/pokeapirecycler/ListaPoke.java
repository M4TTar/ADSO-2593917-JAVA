package com.example.pokeapirecycler;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListaPoke {

    @SerializedName("results")
    private List<ResultsItem> results;

    public List<ResultsItem> getResults() {
        return results;
    }

    public static class ResultsItem {
        @SerializedName("name")
        private String name;

        public String getName() {
            return name;
        }
    }
}
