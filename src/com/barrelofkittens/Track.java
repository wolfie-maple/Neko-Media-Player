package com.barrelofkittens;

// Object for songs/media tracks.
public class Track {
    private String name; // The name of the file stored on the system.
    private float weight; // How likely the track is to be selected in a shuffle. Higher value means more likely to be selected.

    Track (){
        name = "";
        weight = 128;
        System.out.println("Warning: this track has no name and thus does not exist!");
    }

    Track (String p){
        name = p;
        weight = 128;
    }

    Track (String p, int w){
        name = p;
        weight = w;
    }

    public float setWeight(float w){
        weight = w;
        return weight;
    }

    public float getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }
}
