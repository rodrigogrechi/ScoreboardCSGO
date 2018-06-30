package br.com.rodrigogrechi.scoreboardcsgo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.rodrigogrechi.scoreboardcsgo.R;
import br.com.rodrigogrechi.scoreboardcsgo.model.Match;

public class ResultsActivity extends AppCompatActivity implements ResultsContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_result);

        ResultsContract.Presenter mPresenter = new ResultsPresenter(this);
        mPresenter.loadResults();
    }

    @Override
    public void showResults(ArrayList<Match> match) {
        ListView lista = (ListView) findViewById(R.id.lista);
        ArrayAdapter<Match> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, match);
        lista.setAdapter(adapter);
    }

}
