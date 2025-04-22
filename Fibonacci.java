import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms (n): ");
        int n = input.nextInt();

        int a = 0, b = 1;

        System.out.println("First " + n + " terms of Fibonacci series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

}
