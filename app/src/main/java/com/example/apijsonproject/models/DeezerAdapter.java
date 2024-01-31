package com.example.apijsonproject.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.apijsonproject.R;

import java.util.List;

public class DeezerAdapter extends RecyclerView.Adapter<DeezerAdapter.DeezerViewHolder> {

    private List<Datum> tracks;
    private int templateLayout;
    private Context context;

    public DeezerAdapter(List<Datum> tracks, int templateLayout, Context context) {
        this.tracks = tracks;
        this.templateLayout = templateLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public DeezerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(templateLayout, parent, false);
        return new DeezerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeezerViewHolder holder, int position) {
        holder.title.setText(this.tracks.get(position).title);
        holder.duration.setText(this.tracks.get(position).duration);
        holder.artist.setText(this.tracks.get(position).artist.name);
        Glide.with(context).load(this.tracks.get(position).md5_image).into(holder.artistImage);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class DeezerViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView duration;
        TextView artist;
        ImageView artistImage;

        public DeezerViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.title_text);
            this.duration = itemView.findViewById(R.id.duration_text);
            this.artist = itemView.findViewById(R.id.artist_text);
            this.artistImage = itemView.findViewById(R.id.image_artist);
        }
    }


}
