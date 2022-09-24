package Functions.Assignments;
import javax.sound.sampled.EnumControl;
import java.util.*;

public class Palindrome {
    public static boolean checkPalindrome(int n) {
        int reverse = 0;
        int palindrome = n;
        while (palindrome != 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;

        while (palindrome!=0){
            int remainder = palindrome%10;
            reverse = reverse *10 + remainder;
            palindrome = palindrome /10;
        }
        if (n==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPalindrome(n));
        System.out.println(isPalindrome(n));


    }
}
