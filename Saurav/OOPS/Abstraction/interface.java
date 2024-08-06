public class interface{
    public static void main(String[] args) {
  child monu = new child();
  monu.display();
  monu.hair();
  monu.eye();
  monu.ear();
  monu.nose();

    }
}
interface father{
    void hair();
    void eye();
}
interface mother{
    void height();
    void weight();
}
class child implements father,mother{
    public void hair(){
        System.out.println("child has black hair");
}
     public void height{
        System.out.println("child is 1.5m tall");
     }
}

