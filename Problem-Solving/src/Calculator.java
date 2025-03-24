import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Operator : + - * / % : ");
        char operator = sc.next().trim().charAt(0);

        long answer = 0;

        if(operator == '+'|| operator == '-' || operator == '*' || operator == '/' || operator == '%' ){

            System.out.print("Enter two numbers : ");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();

            if(operator == '+'){
                answer = number1 + number2;
            }
            if(operator == '-'){
                answer = number1 - number2;
            }
            if(operator == '*'){
                answer = number1 * number2;
            }
            if(operator == '/'){
                answer = (number1 / number2);
            }
            if(operator == '%'){
                answer = number1 % number2;
            }

            System.out.println(answer);

        }else{
            System.out.println("Entered Operator is Invalid");
        }
    }
}
