package com.camera;

import com.camera.Camera;

public class FactoryCam extends Camera {


    FactoryCam() {
        this.name = "공장카메라";
    }
    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }

    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    public void detect() {
        System.out.println("화재를 감지합니다.");
    }

    public void report() {
        System.out.println("화재 신고를 진행합니다.");
    }


}
