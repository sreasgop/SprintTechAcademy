// Write a program to check if the entered number is even or odd. 
// An even number is a multiple of 2, which also means that an even number when divided by 2 will return 0.
// Dividing a number by 2 and then checking if the remainder is 0 or not. 

// % --> This is the modulus operator. This returns us the remainder. 

// What is the starting point of a java program?
// The main function/method is the staring point of a java program

import java.util.Scanner;

public class Conditionals04 {
    public static void main(String[] args){

        // Creating an object of the Scanner class in order to be able to take input from the command line.
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number and taking the input using the object of the scanner class.
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if( num%2 == 0){
            System.out.println("Entered number is even.");
        } else {
            System.out.println("Entered number is odd.");
        }

        sc.close();
    }
}
