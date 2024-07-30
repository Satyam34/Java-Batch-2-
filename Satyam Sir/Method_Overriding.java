public class Method_Overriding {
    public static void main(String[] args) {
        Child sonu=new Child();
        sonu.add(4, 0);
    }
}

class Father{

    Father(){
        System.out.println("Father Hu");
    }

    void add(int a, int b){
        System.out.println("Father Class Working...!");
    }
}

class Child extends Father {
    void add(int a, int b){
        System.out.println("Child Class Working...!");
    }
}
