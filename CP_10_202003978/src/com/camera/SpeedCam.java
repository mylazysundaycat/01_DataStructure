package com.camera;

import com.camera.Camera;

public class SpeedCam extends Camera {

    SpeedCam(){
        super.name = "과속단속 카메라";
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void Number() {
        System.out.println("차량 번호를 감지합니다.");
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        Number();
    }

    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        System.out.println("사고를 감지합니다.");
    }

    public void report() {
        System.out.println("사고 신고를 진행합니다.");
    }
}
