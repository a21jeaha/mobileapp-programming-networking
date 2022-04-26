package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    private ArrayList<Mountain> mountains;
    private RecyclerView recyclerView;
    private RecyclerViewAdapterMountain mountainAdapter;          ////// vad ska man göra med denna ? ?? ? ? ska det stå <mountain>?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mountains = new ArrayList<>();
        new JsonFile(this, this).execute(JSON_FILE);
        //new JsonTask(this).onPostExecute(JSON_URL);              ///////// add to README
        setAdapter();

    }

    private void setAdapter(){

        mountainAdapter = new RecyclerViewAdapterMountain(mountains);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mountainAdapter);
    }

    @Override
    public void onPostExecute(String json)
    {
        Log.d("MainActivity", json);
    }


}
