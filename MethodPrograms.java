public class MethodPrograms {

    // 1. Print all odd numbers from 1 to n
    public void printOddNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // 2. Convert days into years, months, and days
    public void convertDays(int totalDays) {
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

    // 3. Harshad number
    public boolean isHarshad(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return (num % sum == 0);
    }

    // 4. Count words in a string
    public int countWords(String str) {
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(str.charAt(i)) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(str.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    // 5. Compound interest
    public void compoundInterest(double principal, double rate, int time) {
        double amount = principal;
        for (int i = 1; i <= time; i++) {
            amount += (amount * rate / 100);
        }
        double compoundInterest = amount - principal;
        System.out.println("Compound Interest: " + compoundInterest);
    }

    // 6. Palindrome prime
    public boolean isPalindromePrime(int n) {
        return isPalindrome(n) && isPrime(n);
    }

    public boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return original == reverse;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 7. Swap using temporary variable
    public void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // 8. Swap without using temporary variable
    public void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // 9. Sum of first n natural numbers
    public int sumFirstNNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 10. Print all factors of a number
    public void printFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    // 11. Calculate the cube of a number
    public int cube(int n) {
        return n * n * n;
    }

    // 12. Duck number
    public boolean isDuckNumber(int num) {
        while (num > 0) {
            if (num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }

    // 13. Multiplication tables 1 to 10
    public void printMultiplicationTables() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    // 14. Sum of squares of digits
    public int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // 15. Count uppercase and lowercase characters in a string
    public void countCases(String input) {
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }

    // 16. Kaprekar number
    public boolean isKaprekar(int n) {
        int square = n * n;
        String str = String.valueOf(square);
        for (int i = 1; i < str.length(); i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (right != 0 && left + right == n) return true;
        }
        return n == 1;
    }

    // 17. Reverse an integer without converting to string
    public int reverseInt(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // 18. Fibonacci series
    public void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // 19. Return ASCII value of a character
    public int getAsciiValue(char ch) {
        return (int) ch;
    }
}
