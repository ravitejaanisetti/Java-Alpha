package Functions;

public class DecimalToBinary {
    public static void getBinary(int decNum){
        int pow=0;
        int binNum =0;

        while(decNum>0){
            int rem = decNum%2;
            binNum= binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum =decNum/2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        getBinary(8);

    }
}
