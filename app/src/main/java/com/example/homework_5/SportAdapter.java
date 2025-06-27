package com.example.homework_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {

    private Context context;
    private List<Sport> sportList;

    public SportAdapter(Context context, List<Sport> sportList) {
        this.context = context;
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sport, parent, false);
        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.tvSportName.setText(sport.getName());
        holder.imgSport.setImageResource(sport.getImageResId());
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public static class SportViewHolder extends RecyclerView.ViewHolder {
        ImageView imgSport;
        TextView tvSportName;

        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            imgSport = itemView.findViewById(R.id.imgSport);
            tvSportName = itemView.findViewById(R.id.tvSportName);
        }
    }
}
