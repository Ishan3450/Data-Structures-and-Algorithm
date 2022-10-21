public class Fibonacci{
    public static void main(String args[]){
        fibo(5);
        System.out.println("-----------------------");
        System.out.println(fibonacciUsingRecursion(4));
    }

    static void fibo(int n){
        int n1 = 0;
        int n2 = 1;

        System.out.println(n1);
        System.out.println(n2);
        
        for(int i=1; i<n; i++){
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }

    static int fibonacciUsingRecursion(int n){
        // base condition
        if(n < 2){
            return n;
        }

        // recursive condition
        return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
    }

}