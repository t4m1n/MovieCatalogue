package com.fiqartamin.moviecatalogue;

import android.content.res.TypedArray;
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

    private String[] dataTitle, dataDesc, dataRelease;
    private TypedArray dataPhoto;
    private RecyclerView recyclerView;
    private List<Movie> movieList;

    View v;

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

        prepare();
        addItem();
    }

    private void prepare() {
        dataTitle = getResources().getStringArray(R.array.data_title);
        dataDesc = getResources().getStringArray(R.array.data_description);
        dataRelease = getResources().getStringArray(R.array.data_release);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }

    private void addItem() {
        movieList = new ArrayList<>();

        for (int i = 0; i < dataTitle.length; i++) {
            Movie movie = new Movie();
            movie.setTitle(dataTitle[i]);
            movie.setDesc(dataDesc[i]);
            movie.setRelease(dataRelease[i]);
            movie.setPhoto(dataPhoto.getResourceId(i, -1));
            movieList.add(movie);
        }

    }
}
