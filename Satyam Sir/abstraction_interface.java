public class abstraction_interface {
    public static void main(String[] args) {
        Child monu=new Child();
        monu.eyes();
        monu.talk();
        monu.hair();
        monu.hight();
    }
}

interface Father{
    void hair();
    void talk();
}

interface Mother{
     void hight();
     void eyes();
}

class Child implements Father, Mother{
    public void hair(){
        System.out.println("Blacki");
    }
    public void talk(){
        System.out.println("good");
    }
    public void hight(){
        System.out.println("5.7");
    }
    public void eyes(){
        System.out.println("blue");
    }
}

