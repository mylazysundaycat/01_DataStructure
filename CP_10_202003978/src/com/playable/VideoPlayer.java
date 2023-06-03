package com.playable;

public class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("영상을 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("영상을 일시정지합니다.");
    }

    public void stop() {
        System.out.println("영상을 정지합니다.");
    }
}
