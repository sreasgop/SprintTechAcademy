// Write a program to ask the user to enter a number and using conditional statements check if the entered number is a positive one, a negative one or neither.

import java.util.Scanner;

public class Conditionals03 {
    public static void main(String[] unnati){

        // Let's create an object of the Scanner Class:
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user: 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(num == 0){
            System.out.println("Entered number is 0.");
        } else if(num > 0){
            System.out.println("Entered number is positive.");
        } else {
            System.out.println("Entered number is negative.");
        }

        sc.close();
    }

}
