import java.util.*;
import java.lang.*;

public class Exception_handel_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your number 1 :");
            int number_1 = sc.nextInt();


            System.out.print("Enter your number 2 :");
            int number_2 = sc.nextInt();
            try {
                System.out.println("Answer :" + div(number_1, number_2));
                throw new myException();
            } catch (Exception e) {
                System.out.println("Exception !");
            }
        } catch (Exception e) {
            System.out.println("Exception ! in Entry");
        }
    }

    static int div(int a, int b) throws Exception {
        int div_num = a / b;
        return div_num;
    }
}

class myException extends Exception{
        
}
