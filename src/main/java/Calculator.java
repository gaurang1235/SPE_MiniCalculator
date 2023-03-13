package org.example;

import org.example.Opeartions.Factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Scientific Calculator\n\n Select operation:");
            System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // Factorial
                    double number;
                    Factorial fact = new Factorial();
                    System.out.print("Enter a number : ");
                    number = scanner.nextDouble();
                    System.out.println("Factorial of "+number+" is : " + fact.factorial(number));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
}
