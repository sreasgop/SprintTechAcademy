import java.util.Scanner;   

public class Conditionals06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your class: ");
        int className = sc.nextInt();

        // Clearing the input buffer: 
        sc.nextLine();

        System.out.print("Enter your name: ");
        String ch = sc.nextLine();

        System.out.println("The first letter or your name: " + ch);
        System.out.println("You are " + age + " years old.");
        System.out.println("You study in class " +  className);

        sc.close();
    }
}
