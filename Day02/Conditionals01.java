// Conditionals: Conditional statements helps us make decisions in a program. Conditionals are also called decision making statements.
// if statements
// if-else statements
// if-else if-else statements

import java.util.Scanner;


public class Conditionals01 {
    public static void main(String[] args){
        
        // Anytime we create an instance or object of a class we need to use the new keyboard, followed by the constructor of that class. 
        // What is a Constructor? As the name suggests it helps us construct an object. Every class has a constructor that creats an object of that specific class.
        Scanner khushi = new Scanner(System.in); 
        
        System.out.print("Enter your age: ");
        // We need a variable to store age:
        int age = khushi.nextInt();
        
        if(age >= 18){
            System.out.println("Person is eligible to vote.");
        } else {
            System.out.println("Person is not eligible to vote.");
        }

        khushi.close();

    }
}

