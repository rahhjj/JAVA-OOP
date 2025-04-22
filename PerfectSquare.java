import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
    
}
