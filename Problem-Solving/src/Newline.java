import java.util.Scanner;

public class Newline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers ");
        int num= sc.nextInt();
        String num1 = sc.nextLine().trim();

        System.out.println(num);
        System.out.println(num1);
    }
}
