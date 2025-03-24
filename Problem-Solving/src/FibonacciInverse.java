import java.util.Scanner;

public class FibonacciInverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int previous = 0;
        int current = 1;

        System.out.print("Fibonacci value for calculate previous two values : ");
        int fiboValue = sc.nextInt();


        if (fiboValue < 0) {
            System.out.println("Invalid input! Fibonacci numbers cannot be negative.");
            return;
        }

        if(fiboValue == 0){
            System.out.println("0 + 0");
            return;
        }

        if(fiboValue == 1){
            System.out.println("0 + 1");
            return;
        }

        while (fiboValue > current ) {
            int temp = current;
            current = previous + current;
            previous = temp;
        }

        if(fiboValue == current){
            System.out.println((current-previous)+ " + " + previous);
        }else{
            System.out.println("The Give Number Is Not A Fibonacci Number");
        }

        sc.close();
    }
}
