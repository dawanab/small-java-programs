import java.util.Scanner;

//This program prints out a multiplication table.

public class MultiplicationTable {
    public static void main(String[] args) {
        // prompt the user for a number to compute the table
        System.out.println("Please enter an integer");
        Scanner scan = new Scanner(System.in);
        
        int myNum = scan.nextInt();
        scan.close();
    
        // Loop to begin at 0 and the user's number will print multiples 
        // for digits up to 10.
        for (int i = 0; i <= 10; i++) {
            System.out.println(myNum + " x " + i + " = " + myNum *i);
        }   
    }
}








