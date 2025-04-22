import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;         
            reversed = reversed * 10 + digit;
            num /= 10;                  
        }

        System.out.println("Reversed number of " + original + " is: " + reversed);
    }

}
