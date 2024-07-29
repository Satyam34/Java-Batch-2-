public class Method_Overloading {
    public static void main(String[] args) {
        Method sum=new Method();
        sum.add(5 , 7);
        
    }
}
class Method{
    void add(){
        System.out.println("Add 1 working!");
    }
    void add(int a, int b){
        System.out.println("Add 2 working!");
    }
    void add(int a, int b, int c){
        System.out.println("Add 3 working!");
    }
}
