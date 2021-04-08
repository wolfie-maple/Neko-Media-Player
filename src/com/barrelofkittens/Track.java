package com.barrelofkittens;

// Object for songs/media tracks.
public class Track {
    private String path; // Where the file is stored on the system.
    private float weight; // How likely the track is to be selected in a shuffle. Higher means more likely to be selected.

    Track (){
        path = "";
        weight = 0;
        System.out.println("Warning: this track has no path and thus does not exist!");
    }

    Track (String p){
        path = p;
        weight = 0;
    }

    Track (String p, int w){
        path = p;
        weight = w;
    }

    public float setWeight(float w){
        weight = w;
        return w;
    }

    public float getWeight(){
        return weight;
    }
}
