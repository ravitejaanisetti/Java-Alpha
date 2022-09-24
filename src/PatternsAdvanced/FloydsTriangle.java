package PatternsAdvanced;

public class FloydsTriangle {
    public static void FloydsTriangle(int n){
        int counter =1;
        for (int i=1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloydsTriangle(12);

    }
}
