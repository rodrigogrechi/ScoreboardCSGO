package br.com.rodrigogrechi.scoreboardcsgo.ui;

import android.util.Log;

import java.util.ArrayList;

import br.com.rodrigogrechi.scoreboardcsgo.model.Match;
import br.com.rodrigogrechi.scoreboardcsgo.remote.ApiClient;
import br.com.rodrigogrechi.scoreboardcsgo.remote.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultsPresenter implements ResultsContract.Presenter {

    private ResultsContract.View mView;

    public ResultsPresenter(ResultsContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void loadResults() {
        ApiInterface apiInterface = ApiClient.getClient();

        Call<ArrayList<Match>> call = apiInterface.getResults();
        call.enqueue(new Callback<ArrayList<Match>>() {
            @Override
            public void onResponse(Call<ArrayList<Match>> call, Response<ArrayList<Match>> response) {
                mView.showResults(response.body());
                Log.i("teste", "Response");
            }

            @Override
            public void onFailure(Call<ArrayList<Match>> call, Throwable t) {
                Log.i("teste", "Failure" + t);
            }
        });
    }
}
