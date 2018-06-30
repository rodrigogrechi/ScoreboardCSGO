package br.com.rodrigogrechi.scoreboardcsgo.ui;

import java.util.ArrayList;

import br.com.rodrigogrechi.scoreboardcsgo.model.Match;

public interface ResultsContract {
    interface Presenter{
        void loadResults();
    }

    interface View {
        void showResults(ArrayList<Match> match);
    }
}
