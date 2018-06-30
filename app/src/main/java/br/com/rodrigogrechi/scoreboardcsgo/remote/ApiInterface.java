package br.com.rodrigogrechi.scoreboardcsgo.remote;

import java.util.ArrayList;

import br.com.rodrigogrechi.scoreboardcsgo.model.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("results")
    Call<ArrayList<Match>> getResults();
}
