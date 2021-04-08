package com.barrelofkittens;

public class Library {
    private Track[] trackArray;
    private String folderPath;
    float totalWeight;
    // TODO: totalWeight variable to track the total weight of all tracks in the trackMap


    Library (){
        trackArray = new Track[5];
    }

    Library (Track[] a){
        trackArray = a;
    }

    Library (String p){
        folderPath = p;
        // TODO: scan path for music files and create a trackMap out of them
    }

    public void NextTrack(){
        // TODO: Improve algorithm runtime if possible
        // This algorithm has a runtime of O(n), where n is the size of the array/map.
        // I want to be able to support really large playlists, so looking into cutting this down would be good.

        int idx = 0;
        for (double r = Math.random() * totalWeight; idx < trackArray.length - 1; ++idx) {
            r -= trackArray[idx].getWeight();
            if (r <= 0.0) break;
        }
    }
}
