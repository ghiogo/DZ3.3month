package com.example.dz33month;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NamesViewHolder> {


    private List<String> listNames;

    public NamesAdapter(List<String> listNames) {
        this.listNames = listNames;
    }


    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NamesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false));
    }

    public class NamesViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;

        public NamesViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
            image = itemView.findViewById(R.id.imageView);
        }

        public void onBind(String listNames) {
            name.setText(listNames);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
        holder.onBind(listNames.get(position));
    }

    @Override
    public int getItemCount() {
        return listNames.size();
    }
}
