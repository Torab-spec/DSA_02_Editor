import java.util.Scanner;

public class ReverseInteger {
    // LeetCode:7 - Reverse integer
    public static void main(String[] args) {

        System.out.print("Enter your number : ");
        Scanner input = new Scanner(System.in);
        int nums =  input.nextInt();
        int num = nums;
        int rem = 0;
        int rev = 0;
         while (num != 0) {
             rem = num % 10;
             rev = rev * 10 + rem;
             num /= 10;
         }
        System.out.printf("Normal number %d , reversed number %d ", nums, rev);





    }
}
