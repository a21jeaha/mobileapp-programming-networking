package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
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
        private TextView mountainUrl;


        public ViewHolder(@NonNull View view) {                     // De Views som valts för recyclerViewn associeras med variabler via deras id.
            super(view);

            mountainName = view.findViewById(R.id.mountain_name);
            mountainUrl = view.findViewById(R.id.Url);
        }
    }


    @NonNull
    @Override
    public RecyclerViewAdapterMountain.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  // layouten i `list_item` sätts för varje ny rad

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterMountain.ViewHolder holder, int position) {    // De Views som inte är konstanter och är en del av recyclern får innehållet satt här
         Mountain mountain = mountains.get(position);
         holder.mountainName.setText(mountain.getName());
         holder.mountainUrl.setText(mountain.getAuxdata().getWiki());
    }

    @Override
    public int getItemCount() {  // Den totala storleken av listan
        return mountains.size();
    }

    public void setMountains(ArrayList<Mountain> mountains) {      // här sätts innehållet för listan (när den anropas)
        this.mountains = mountains;

    }
}
