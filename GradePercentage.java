import java.util.Scanner;

public class GradePercentage {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMarks = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        double percentage = (double) totalMarks / (subjects * 100) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
    
}
