// This is a console-based calculator which can perform addition, subtraction, multiplication, and division, by Java:

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        double num1;
        String operator;
        double num2;
        double output;

        while (true) {
            System.out.println("\nPlease enter the first number:");
            if (myScanner.hasNextDouble()) {
                num1 = myScanner.nextDouble();
                break;
            } else {
                System.out.println("\nInvalid input, please try again.");
                myScanner.next();
            }
        }

        while (true) {
            System.out.println("\nPlease enter an operator (+, -, *, /):");
            operator = myScanner.nextLine();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            } else {
                System.out.println("\nInvalid input, please enter +, -, * or /.");
            }
        }        

        while (true) {
            System.out.println("\nPlease enter the second number:");
            if (myScanner.hasNextDouble()) {
                num2 = myScanner.nextDouble();
                break;
            } else if (operator == "/" && myScanner.nextDouble() == 0) {
                System.out.println("\nDividing by zero is not allowed, please try again.");
            } else {
                System.out.println("\nInvalid input, please try again.");
                myScanner.next();
            }
        }
        myScanner.close();
        switch (operator) {
            case "+":
                output = num1 + num2;
                break;
            case "-":
                output = num1 - num2;
                break;
            case "*":
                output = num1 * num2;
                break;
            case "/":
                output = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator.");
            return;
        }
        
        System.out.println("The answer is " + output + ".");

    }

}