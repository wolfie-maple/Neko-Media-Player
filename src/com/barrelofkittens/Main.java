package com.barrelofkittens;

import javazoom.jl.player.*;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        TopLevelWindow window = new TopLevelWindow();
        window.CreateWindow();
        Library lib = new Library();

        try{

            FileInputStream fis = new FileInputStream("C:\\Users\\Wolfie\\Desktop\\godot.mp3");

            Player playMP3 = new Player(fis);

            playMP3.play();

        }catch(Exception e){System.out.println("hhhhhhhh");}
    }
}
