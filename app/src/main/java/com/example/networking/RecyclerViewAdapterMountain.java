package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;





public class RecyclerViewAdapterMountain extends RecyclerView.Adapter<RecyclerViewAdapterMountain.ViewHolder> {

    ArrayList<Mountain> mountains;


    public RecyclerViewAdapterMountain(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mountainName;
        private ImageView mountainImage;


        public ViewHolder(@NonNull View view) {
            super(view);

            mountainName = view.findViewById(R.id.mountain_name);
        }
    }


    @NonNull
    @Override
    public RecyclerViewAdapterMountain.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterMountain.ViewHolder holder, int position) {
         Mountain mountain = mountains.get(position);
         holder.mountainName.setText(mountain.getName());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

//    public void setMountains(ArrayList<Mountain> mountains) {
//        this.mountains = mountains;
//    }
}
