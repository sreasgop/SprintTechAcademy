// Write a program in java using switch case to create a basic calculator. 
// Addition, Subtraction, Multiplication and Division.

import java.util.Scanner;

public class Conditionals05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Prompt the user: to enter the first number 
        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();
        
        // Prompt the user: to enter the second number
        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();

        // Clearing Input Buffer: Whatever is stored there int the input stream i.e. 'Enter'
        sc.nextLine();

        // Prompting the user to enter a arithmetic symbol to perform that specific operation: 
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.nextLine().charAt(0);

        // Whenever a decision making is involved in your program which revolves around a single variable entity you should use the switch case to make the decision.
        switch (operator) {
            case '+':
                System.out.println("Sum: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference: " + (num1 - num2));    
                break;
            case '*':
                System.out.println("Product: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Opeartor!");
                break;
        }

        sc.close();
    }
}
