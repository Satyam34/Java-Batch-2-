public class test_Abstraction {
    public static void main(String[] args) {
        farari fast=new farari();
        fast.weels();

    }
}

abstract class Car{
       abstract void weels();
}

class farari extends Car{
    void weels(){
        System.out.println("4 weels");
    }
}

