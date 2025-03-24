import java.util.Scanner;

public class Fibonacci {  // Corrected class name

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int previous = 0;
        int current = 1;

        System.out.println("Which Fibonacci Value do you need (index starts from 0)? ");
        int fiboValueIndex = sc.nextInt();

        if (fiboValueIndex < 0) {  // Input validation
            System.out.println("Index must be a non-negative integer ");
            return;
        }

        if (fiboValueIndex == 0) {
            System.out.println(previous);
            return;
        }

        if (fiboValueIndex == 1) {
            System.out.println(current);
            return;
        }

        int count = 2;

        while (count <= fiboValueIndex) {
            int temp = current;
            current = previous + current;
            previous = temp;
            count++;
        }

        System.out.println(current);

        sc.close();
    }
}
