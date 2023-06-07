package test14;

public class Choi extends person {
    int age;
    String name;
    Choi(){
        name="최소연";
    }
    Choi(String name){
        super.name = name;
    }

    void hi(){
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
