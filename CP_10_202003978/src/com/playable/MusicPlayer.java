package com.playable;

public class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("음악을 일시정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 정지합니다.");
    }
}
