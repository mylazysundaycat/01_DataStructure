public class MainJavaCP09 {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "검정색 모델";
        b1.resolution = "HD";
        b1.price = 250000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        b1.record(false,false,10);
        b1.record(true,true,3);

        System.out.println("----------------------");

        BlackBox b2 = new BlackBox();
        b2.modelName = "흰색 모델";
        b2.resolution = "FHD";
        b2.price = 350000;
        b2.color = "화이트";
        System.out.println(b2.modelName);

        System.out.println("-----------------------");

        b1.insertMemoryCard(256);

        //일반 영상:1
        //이벤트 영상:2

        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수:"+fileCount+"개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수:"+fileCount+"개");


        System.out.println("-개발 전-");
        System.out.println(b1.modelName+"자동 신고 기능:"+b1.canAutoReport);
        System.out.println(b2.modelName+"자동 신고 기능:"+b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능:"+BlackBox.canAutoReport);
        
        //기능 개발
        BlackBox.canAutoReport = true;
        
        System.out.println("-개발 후-");
        System.out.println(b1.modelName+"자동 신고 기능:"+b1.canAutoReport);
        System.out.println(b2.modelName+"자동 신고 기능:"+b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능:"+BlackBox.canAutoReport);


    }
}
