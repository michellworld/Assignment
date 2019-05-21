//Program that accepts two integers and an operation as inputs and outputs the result
//Author: michael Dada
//Date: 16 May, 2019.
import java.util.Scanner;

public class MathApp {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Input Operator: ");
                String operator = input.nextLine();
            System.out.println("Input FirstNumber: ");
                int number1 = input.nextInt();
            System.out.println("Input SecondNumber: ");
                int number2 = input.nextInt();
            
            double add = number1 + number2;
            double sub = number1 - number2;
            double div= number1 / number2;
            double multiply = number1 * number2;
            double modulus = number1 % number2;
            double power = Math.pow(number1,number2);
            
            switch (operator) {
                case "+":
                System.out.printf("Result: %s ", add);
                break;
                case "-":
                System.out.printf("Result: %s ", sub);
                break;
                case "/":
                System.out.printf("Result: %s ", div);
                break;
                case "*":
                System.out.printf("Result: %s ", multiply);
                break;
                case "%":
                System.out.printf("Result: %s ", modulus);
                break;
                case "^":
                System.out.printf("Result: %s ", power);
                break;
                
            }
        }


}
