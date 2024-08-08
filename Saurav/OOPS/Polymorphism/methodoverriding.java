
public class methodoverriding {

    public static void main(String[] args) {
        Son abc = new Son();
        abc.add(4, 5);
    }
}

    class Father {

        void add(int a, int b) {
            System.out.println("father hu");
        }
    }

    class Son extends Father{

        void add(int a, int b) {
            System.out.println("son hu");
        }
    
}
