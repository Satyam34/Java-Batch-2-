class pen{
    String color; //ballpoint,gel
    String brand;

    public void write() {
        System.out.println("writting something");// the function which define under class is called method.
    }


}

public class oops{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color="blue";
        p1.brand="link";
        
        p1.write();
}
}