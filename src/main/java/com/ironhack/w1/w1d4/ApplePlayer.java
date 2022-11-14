package com.ironhack.w1.w1d4;

public class ApplePlayer extends Player implements IPlayable{
    public ApplePlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("closing ApplePlayer");
    }

    @Override
    public void play() {

    }

    @Override
    public void mute() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void increaseVolume() {
        setVolume(getVolume() + 0.1);
        if (getVolume() > MAX_VOLUME) setVolume(1);
    }
}
