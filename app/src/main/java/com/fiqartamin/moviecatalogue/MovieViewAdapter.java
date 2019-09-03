package com.fiqartamin.moviecatalogue;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MovieViewAdapter extends RecyclerView.Adapter<MovieViewAdapter.MyViewHolder> {
    Context context;
    List<Movie> mData;

    public MovieViewAdapter(Context context, List<Movie> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false);
        MyViewHolder vHolder = new MyViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        holder.tvTitle.setText(mData.get(i).getTitle());
        holder.tvDesc.setText(mData.get(i).getDesc());
        holder.imgPhoto.setImageResource(mData.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvDesc;
        private ImageView imgPhoto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.movie_title);
            tvDesc = itemView.findViewById(R.id.movie_desc);
            imgPhoto = itemView.findViewById(R.id.movie_img);
        }
    }
}
