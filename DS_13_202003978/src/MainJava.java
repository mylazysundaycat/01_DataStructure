public class MainJava {
    public static void main(String[] args) {
        Entry[] a = new Entry[16];
        a[1]=new Entry(90,"애니비아");
        a[2]=new Entry(80,"신드라");
        a[3]=new Entry(70,"카이사");
        a[4]=new Entry(50,"아무무");
        a[5]=new Entry(60,"요릭");
        a[6]=new Entry(20,"티모");
        a[7]=new Entry(30,"야스오");
        a[8]=new Entry(35,"세트");
        a[9]=new Entry(10,"다리우스");
        a[10]=new Entry(15,"자르반");
        a[11]=new Entry(45,"유미");
        a[12]=new Entry(40,"갈리오");

        BHeap h = new BHeap(a,12);

        System.out.println("힙 만들기전");
        h.print();

        h.createHeap();
        System.out.println("힙 만든후(최소힙)");
        h.print();

        System.out.println("min 삭제후");
        System.out.println(h.deleteMin().getValue());
        h.print();
    }
}
