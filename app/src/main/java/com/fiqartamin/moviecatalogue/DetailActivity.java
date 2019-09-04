package com.fiqartamin.moviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Movie selectedMovie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (selectedMovie != null) {
            tvTitle = findViewById(R.id.movie_det_title);
            tvTitle.setText(selectedMovie.getTitle());

            if(getSupportActionBar() != null){
                getSupportActionBar().setTitle(selectedMovie.getTitle());
            }
        }
    }
}
