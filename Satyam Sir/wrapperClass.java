import java.util.*;

public class wrapperClass {
    public static void main(String[] args) {
        Doge<String> Doggy=new Doge<>(null);
        Doggy.id="Pappu";
        Doggy.print();
    }
}

class Doge<T>{
    T id;

    Doge( T id){
        this.id=id;
    }

    void print(){
        System.out.println(this.id);
    }
}