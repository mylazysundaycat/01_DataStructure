public class Camera {
    String name;
    public Camera() {
        this("카메라");
    }
    public Camera(String name) {
        this.name = name;
    }

    public void takePicture() {
        System.out.println(this.name+"의 시간을 출력합니다");
    }

    public void recordVideo() {
        System.out.println(this.name+"의 동영상을 출력합니다.");
    }

    public void showMainFeature() {
        System.out.println("과속단속 주요기능: 사진촬영, 동영상 녹화");
    }

}
