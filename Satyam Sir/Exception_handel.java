import java.lang.*;
import java.util.*;

public class Exception_handel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        try{
            System.out.print("Enter your number : ");
            int number = sc.nextInt();
            System.out.println(number + "<--");
        }catch(Exception e){
            System.out.println("yha pr kuch to glt ho rha hai! : ");
        }finally{
            System.out.println("Hello My name is Finally!");
        }
    }

}
