package com.fiqartamin.moviecatalogue;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    TextView tvTitle, tvRelease, tvDesc, tvCategory;
    ImageView imgPhoto, imgThumb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Movie selectedMovie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (selectedMovie != null) {
            tvTitle = findViewById(R.id.movie_det_title);
            tvTitle.setText(selectedMovie.getTitle());

            tvRelease = findViewById(R.id.movie_det_release);
            tvRelease.setText(selectedMovie.getRelease());

            tvDesc = findViewById(R.id.movie_det_desc);
            tvDesc.setText(selectedMovie.getDesc());

            tvCategory = findViewById(R.id.movie_det_cat);
            tvCategory.setText(selectedMovie.getCategory());

            imgPhoto = findViewById(R.id.movie_det_img);
            imgPhoto.setImageResource(selectedMovie.getPhoto());

            imgThumb = findViewById(R.id.movie_det_thumb);
            imgThumb.setImageResource(selectedMovie.getPhoto());

            if(getSupportActionBar() != null){
                getSupportActionBar().setTitle(selectedMovie.getTitle());
            }
        }
    }
}
