import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of a pencil");
        int pricePencil = sc.nextInt();
        System.out.println("Enter the price of a pen");
        int pricePen = sc.nextInt();
        System.out.println("Enter the price of a eraser");
        int priceEraser = sc.nextInt();

        double totalPrice = priceEraser+pricePen+pricePencil;

        if(totalPrice>0){
            double gst = totalPrice*0.18;
            double finalPrice = totalPrice+gst;
            System.out.println("Total price of the items including gst is "+finalPrice);
        } else{
            System.out.println("Total price of the items");
        }

    }
}