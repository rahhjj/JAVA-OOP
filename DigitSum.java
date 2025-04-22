import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;   // get last digit
            sum += digit;           // add to sum
            num /= 10;              // remove last digit
        }

        System.out.println("Sum of digits of " + original + " is: " + sum);
    }
    
}
