import Opeartions.Factorial;
import Opeartions.Logarithm;
import Opeartions.Power;
import Opeartions.SquareRoot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args )
    {

        Calculator calci = new Calculator();

        double number;
        double number2;

        int choice;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------Scientific Calculator-----------------\n\nSelect operation:");
            System.out.print("1. Square root\n2. Factorial\n3. Natural Logarithm\n4. Power\n5. Exit\nEnter your choice: ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    //Square root
                    System.out.print("Enter the number for Square Root : ");
                    number = scanner.nextDouble();
                    System.out.println("Square Root of "+number+" is : " + calci.squareRoot(number));
                    System.out.println("\n");

                    break;
                case 2:
                    // Factorial
                    System.out.print("Enter the number for Factorial : ");
                    number = scanner.nextDouble();
                    System.out.println("Factorial of "+number+" is : " + calci.factorial(number));
                    System.out.println("\n");

                    break;
                case 3:
                    //Natural Logarithm
                    System.out.print("Enter the number for Natural Log : ");
                    number = scanner.nextDouble();
                    System.out.println("Natural Log of "+number+" is : " + calci.log(number));
                    System.out.println("\n");

                    break;
                case 4:
                    //Power
                    System.out.print("Enter the Base Number : ");
                    number = scanner.nextDouble();
                    System.out.print("Enter the Exponent Number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Power of "+number+" raise to "+number2+" is : " + calci.power(number, number2));
                    System.out.println("\n");

                    break;
                case 5:
                    System.out.println("Quitting....\n\n");

                    break;
                default:
                    System.out.println("Wrong I/P try again....\n\n");
            }
        } while (choice!=5);
    }


    public double squareRoot(double num) {
        logger.info("[SQUARE ROOT] - " + num);
        SquareRoot sqrt = new SquareRoot();
        double result = sqrt.squareRoot(num);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }


    public double factorial(double num) {
        logger.info("[FACTORIAL] - " + num);
        Factorial fact = new Factorial();
        double result = fact.factorial(num);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double log(double num) {
        logger.info("[NATURAL LOG] - " + num);
        Logarithm logarithm = new Logarithm();
        double result = logarithm.log(num);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

    public double power(double num1, double num2) {
        logger.info("[Power of - " + num1 + " raise to " + num2 + "]");
        Power pow = new Power();
        double result = pow.power(num1, num2);
        logger.info("[RESULT - POWER Function] - " + result);
        return result;
    }

}
