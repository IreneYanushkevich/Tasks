package com.irinayanushkevich.practice.task5.structural.composit_project;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private List<Musician> musicians = new ArrayList<>();

    public void addMusician(Musician musician) {
        musicians.add(musician);
    }

    public void removeMusician(Musician musician) {
        musicians.remove(musician);
    }

    public void playMusic() {
        System.out.println("Music band plays music");
        for (Musician musician : musicians) {
            musician.play();
        }
    }
}
