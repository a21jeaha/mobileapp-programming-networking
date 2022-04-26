package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

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
        Gson gson = new Gson();

        Type type = new TypeToken <List<Mountain>>() {}.getType();
        List<Mountain> mountains = gson.fromJson( json, type);
        Log.d("MainActivity","" + mountains.get(0).getName());
    }


}
