import java.util.Scanner;

class Am{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pen p1 =new Pen();

        System.out.println("Enter color : ");
        String color=sc.nextLine();

        System.out.println("Enter Type : ");
        String type=sc.nextLine();

        System.out.println("Enter Price$ : ");
        int price=sc.nextInt();

        p1.setColor(color);
        p1.setType(type);
        p1.setPrice(price);
        System.out.println("You buy "+p1.getColor()+" , Type of "+p1.getType()+" and Price is : "+p1.getPrice());
    }
}

class Pen{
    String color="(Sorry data is not set !)";
    String type="(Sorry data is not set !)";
    int price;

    String getColor(){
        return this.color+" Color Pen";
    }
    String getType(){
        return this.type;
    }
    int getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color=color;
    }
    void setType(String type){
        this.type=type;
    }
    void setPrice(int price){
        this.price=price+5;
    }
}

