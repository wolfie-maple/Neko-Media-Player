package com.barrelofkittens;

import java.io.File;

public class Library {
    private Track[] trackMap;
    private String folderPath; // Where the playlist folder is stored on the machine.
    float totalWeight; // Combined weight of all tracks
    // TODO: totalWeight variable to track the total weight of all tracks in the trackMap


    Library (){
        trackMap = new Track[5];
    }

    Library (Track[] a){
        trackMap = a;
    }

    Library (String p){
        folderPath = p;
        // TODO: scan path for music files and create a trackMap out of them
    }

    public void AddTrack(){

    }

    public void RandomTrack(){
        // Selects a random index in the trackMap based on weights
        // This algorithm has a runtime of O(n), where n is the size of the array/map.

        int idx = 0;
        for (double r = Math.random() * totalWeight; idx < trackMap.length - 1; ++idx) {
            r -= trackMap[idx].getWeight();
            if (r <= 0.0) break;
        }
    }
}
