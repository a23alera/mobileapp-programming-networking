package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.ViewHolder> {

    private List<Mountain> mountains;

    public MountainAdapter(List<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(mountains.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
        }
    }
}
