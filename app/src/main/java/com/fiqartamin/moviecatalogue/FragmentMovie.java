package com.fiqartamin.moviecatalogue;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentMovie  extends Fragment{

    View v;
    private RecyclerView recyclerView;
    private List<Movie> movieList;

    public FragmentMovie() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.movie_fragment, container, false);
        recyclerView = v.findViewById(R.id.movie_rv);
        MovieViewAdapter movieViewAdapter = new MovieViewAdapter(getContext(), movieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(movieViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        movieList = new ArrayList<>();
        movieList.add(new Movie("a start is born", "Ini Deskripsi a start is born", R.drawable.movies_poster_a_start_is_born));
        movieList.add(new Movie("alita", "Ini Deskripsi alita", R.drawable.movies_poster_alita));
        movieList.add(new Movie("aquaman", "Ini Deskripsi aquaman", R.drawable.movies_poster_aquaman));
        movieList.add(new Movie("bohemian", "Ini Deskripsi bohemian", R.drawable.movies_poster_bohemian));
        movieList.add(new Movie("cold persuit", "Ini Deskripsi cold persuit", R.drawable.movies_poster_cold_persuit));
        movieList.add(new Movie("a start is born", "Ini Deskripsi a start is born", R.drawable.movies_poster_a_start_is_born));
        movieList.add(new Movie("alita", "Ini Deskripsi alita", R.drawable.movies_poster_alita));
        movieList.add(new Movie("aquaman", "Ini Deskripsi aquaman", R.drawable.movies_poster_aquaman));
        movieList.add(new Movie("bohemian", "Ini Deskripsi bohemian", R.drawable.movies_poster_bohemian));
        movieList.add(new Movie("cold persuit", "Ini Deskripsi cold persuit", R.drawable.movies_poster_cold_persuit));
        movieList.add(new Movie("a start is born", "Ini Deskripsi a start is born", R.drawable.movies_poster_a_start_is_born));
        movieList.add(new Movie("alita", "Ini Deskripsi alita", R.drawable.movies_poster_alita));
        movieList.add(new Movie("aquaman", "Ini Deskripsi aquaman", R.drawable.movies_poster_aquaman));
        movieList.add(new Movie("bohemian", "Ini Deskripsi bohemian", R.drawable.movies_poster_bohemian));
        movieList.add(new Movie("cold persuit", "Ini Deskripsi cold persuit", R.drawable.movies_poster_cold_persuit));
    }
}
