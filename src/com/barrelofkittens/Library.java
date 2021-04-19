package com.barrelofkittens;

import java.io.File;
import java.util.ArrayList;

public class Library {
    private ArrayList<Track> trackMap = new ArrayList<Track>();
    private String folderPath; // Where the playlist folder is stored on the machine.
    float totalWeight; // Combined weight of all tracks
    // TODO: totalWeight variable to track the total weight of all tracks in the trackMap

    Library (ArrayList<Track> a){
        trackMap = a;
    }

    Library (String p){
        folderPath = p;

        File directoryPath = new File(folderPath);

        String contents[] = directoryPath.list();
        for(int i=0; i<contents.length; i++) {
            Track t = new Track(contents[i]);
            trackMap.add(t);
            addTotalWeight(t.getWeight());
        }


    }

    public float getTotalWeight(){
        return totalWeight;
    }

    public float setTotalWeight(float tw){
        totalWeight = tw;
        return totalWeight;
    }

    public float addTotalWeight(float aw){
        totalWeight += aw;
        return totalWeight;
    }

    public float subtractTotalWeight(float sw){
        totalWeight -= sw;
        return totalWeight;
    }

    public void AddTrack(){

    }

    public String getFolderPath(){
        return folderPath;
    }

    public String RandomTrackName(){
        // Selects a random index in the trackMap based on weights
        // This algorithm has a runtime of O(n), where n is the size of the array/map.

        int idx = 0;
        for (double r = Math.random() * totalWeight; idx < trackMap.size() - 1; ++idx) {
            r -= trackMap.get(idx).getWeight();
            if (r <= 0.0) break;
        }

        return trackMap.get(idx).getName();
    }
}
