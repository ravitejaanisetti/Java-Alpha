import java.util.Scanner;

public class AreaSquare{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side of the square:");
            int side = sc.nextInt();
            int area = side*side;

            System.out.println("Area of the square with side"+side+" is "+area);
    }
}