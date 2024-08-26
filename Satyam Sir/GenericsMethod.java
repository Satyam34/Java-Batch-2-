import java.util.*;

public class GenericsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> listTwo=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.clear();
        System.out.println("List-->"+list);

        // Boolean check=list.contains(9);
        // System.out.println("Check-->"+check);

        listTwo.add(9);
        listTwo.add(8);
        listTwo.add(7);
        listTwo.add(6);
        listTwo.add(1);
        System.out.println("List Two-->"+listTwo);

        // Boolean check=list.containsAll(listTwo);
        // System.out.println("Check-->"+check);

        Boolean check=list.isEmpty();
        System.out.println("Check-->"+check);

      
        // list.addAll(listTwo);
        // System.out.println("List-->"+list);




    }
}
