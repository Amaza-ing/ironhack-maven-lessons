package com.ironhack.w1.w1d4;

public interface IPlayable {
    public abstract void play();
    void mute();
    void pause();
    void increaseVolume();

    final double MAX_VOLUME = 1;
}
