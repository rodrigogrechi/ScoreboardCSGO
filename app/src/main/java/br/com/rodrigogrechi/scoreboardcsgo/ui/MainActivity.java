package br.com.rodrigogrechi.scoreboardcsgo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.rodrigogrechi.scoreboardcsgo.R;

public class MainActivity extends AppCompatActivity {

    Button btnShowResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowResults = (Button) findViewById(R.id.btnShowResults);
        btnShowResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultsActivity = new Intent(MainActivity.this, ResultsActivity.class);
                startActivity(resultsActivity);
            }
        });
    }


}
