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

}
