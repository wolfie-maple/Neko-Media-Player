package com.barrelofkittens;

import javazoom.jl.player.*;

import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        TopLevelWindow window = new TopLevelWindow();
        window.CreateWindow();
        Library lib = new Library("C:\\Users\\Wolfie\\Desktop\\testbgm");




        try{
            String nextTrack = lib.RandomTrackName();

            String nextStream = (lib.getFolderPath() + "\\" + nextTrack);

            FileInputStream fis = new FileInputStream(nextStream);

            Player playMP3 = new Player(fis);

            System.out.println("Now playing: " + nextTrack);
            playMP3.play();

        }catch(Exception e){System.out.println("hhhhhhhh");}

    }
}
