package com.dojoandroid.dojoapp.entity;

public class Character {

    private int mResource = 0;
    private String mName = "";

    public void setResource(int resource) {
        mResource = resource;
    }

    public void setName(String name){
        mName = name;
    }

    public int getResource() {
        return mResource;
    }

    public String getName() {
        return mName;
    }

}
