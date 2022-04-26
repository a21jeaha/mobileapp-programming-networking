package com.example.networking;

import androidx.recyclerview.widget.RecyclerView;

public class Mountain {
    private String ID;            // följer inte konvention @SerializeName?
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;           // meter över havet @SerializeName?
    private int cost;           // fötter över havet @SerializeName?
    private Auxdata auxdata;

}
