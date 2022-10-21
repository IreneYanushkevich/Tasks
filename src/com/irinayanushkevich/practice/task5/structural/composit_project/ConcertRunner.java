package com.irinayanushkevich.practice.task5.structural.composit_project;

public class ConcertRunner {

    public static void main(String[] args) {

        MusicBand musicBand = new MusicBand();

        Musician guitarPlayer = new GuitarPlayer();
        Musician bassGuitarPlayer = new BassGuitarPlayer();
        Musician drummer = new Drummer();

        musicBand.addMusician(guitarPlayer);
        musicBand.addMusician(bassGuitarPlayer);
        musicBand.addMusician(drummer);

        musicBand.playMusic();
    }
}
