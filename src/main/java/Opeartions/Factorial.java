package Opeartions;

public class Factorial {

    public double factorial(double number){
        double fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact*= i;
        }
        return fact;
    }
}
