package com.fiqartamin.moviecatalogue;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MovieViewAdapter extends RecyclerView.Adapter<MovieViewAdapter.MyViewHolder> {
    private Context context;
    private List<Movie> mData;

    public MovieViewAdapter(Context context, List<Movie> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false);
        final MyViewHolder vHolder = new MyViewHolder(view);

        vHolder.clMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, mData.get(vHolder.getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        holder.tvTitle.setText(mData.get(i).getTitle());
        holder.tvDesc.setText(mData.get(i).getDesc());
        holder.tvRelease.setText(mData.get(i).getRelease());
        holder.imgPhoto.setImageResource(mData.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout clMovie;
        private TextView tvTitle, tvDesc, tvRelease;
        private ImageView imgPhoto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            clMovie = itemView.findViewById(R.id.movie_const);
            tvTitle = itemView.findViewById(R.id.movie_title);
            tvDesc = itemView.findViewById(R.id.movie_desc);
            tvRelease = itemView.findViewById(R.id.movie_release);
            imgPhoto = itemView.findViewById(R.id.movie_img);
        }
    }
}
