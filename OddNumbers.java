public class OddNumbers {
    public static void printOdds(int n){
        for (int i = 1; i <= n; i += 2) System.out.print(i + " ");
        System.out.println();
    }

    public static void PrintOdds(){
        System.out.println("Printing odds till 10");
        printOdds(10);
    }

    public static void main(String args[]){
        PrintOdds();
    }
}
