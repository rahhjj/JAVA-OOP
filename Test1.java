public class Test1{
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }

    public static void greeting(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        int sum = add(1, 5);
        multiply(1, 5);
        greeting();
        Test1 test = new Test1();
        test.greeting();
    }
    
}


