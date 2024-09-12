// Calculate wages based on the number of hours worked. Ask a user the number of hours worked and then based on the following table calculate their wage: 
// Greater than 2 hours: $10
// Greater than 5 Hours: $15
// Greater than 20 Hours: $40

import java.util.Scanner;

public class Conditionals02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of hours worked: "); 
        int hoursWorked = sc.nextInt();

        int wage;

        if(hoursWorked > 20){
            wage = hoursWorked * 40;
            System.out.println("Wage: $"+ wage);
        } else if(hoursWorked > 5){
            wage = hoursWorked * 15;
            System.out.println("Wage: $" + wage);
        } else {
            wage = hoursWorked * 10;
            System.out.println("Wage: $" + wage);
        }

        sc.close();
    }
}
