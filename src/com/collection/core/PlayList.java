package com.collection.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayList {
    private ArrayList<Chanson> chansons;

    public PlayList(ArrayList<Chanson> chansons) {
        this.chansons = chansons;
    }
    public PlayList() {
        this.chansons = new ArrayList<Chanson>();
    }

    public int size() {
        return chansons.size();
    }

    public void addSong(Chanson chanson) {
        chansons.add(chanson);
    }

    public void removeSong(int index) {
        chansons.remove(index);
    }

    public Chanson getSong(int index) {
        return chansons.get(index);
    }

    public List<Chanson> getArtistSongs(String artiste) {
        List<Chanson> chansonByArtist = new ArrayList<Chanson>();
        Iterator<Chanson> iterate = chansons.iterator();
        while (iterate.hasNext()) {
            Chanson chansonCourante = iterate.next();
            if (chansonCourante.getArtiste().equals(artiste)) {
                chansonByArtist.add(chansonCourante);
            }
        }
        return chansonByArtist;
    }

    public int getTotalDuration() {
        Iterator<Chanson> iterate = chansons.iterator();
        int totalDuration = 0;
        while (iterate.hasNext()) {
            Chanson chansonCourante = iterate.next();
            totalDuration = totalDuration + chansonCourante.getDuree();
        }
        return totalDuration;
    }

    public ArrayList<Chanson> getChanson() {
        return chansons;
    }
}
