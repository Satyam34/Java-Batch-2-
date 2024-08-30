import java.util.*;

public class CollectionStacks {
    //  static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     public static int pop(){
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     public static int peek(){
    //         int top = list.get(list.size()-1);
    //         return top;
    //     }

    //     public static boolean isEmpty(){
    //         return list.size()==0;
    //     }
    // }

    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(4);
        list.push(7);
        list.push(2);

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }
}
