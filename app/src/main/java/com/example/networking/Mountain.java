package com.example.networking;

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

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public int getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public Auxdata getAuxdata() {
        return auxdata;
    }


}
