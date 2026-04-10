package com.pluralsight;

import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {
        //add input function
        Scanner input = new Scanner(System.in);
        //------------- USER INPUTS BELOW -------------

        //input.nextLine is the string version "input" calls the scanner on line 8
        System.out.print("Name: ");
        String employeeName = input.nextLine();

        //Changed string to double and nextLine to nextDouble
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        //Asks for pay rate and overtime variable
        System.out.print("What is your Hourly pay? ");
        double payRate = input.nextDouble();

        //Calculates Pay based off values they entered
        double payCalc = payRate * hoursWorked;
        double otPay = (hoursWorked - 40) * (payRate * 1.5);

        // the first 40 hours would be calculated as normal then, after 40 you would use ot pay and add it ontop of the normal pay
        if (hoursWorked > 40){
            payCalc = 40 * payRate;
            System.out.printf("%s's weekly pay is $%.2f",employeeName, payCalc + otPay);
        }
        else {
            System.out.printf("%s's weekly pay is $%.2f",employeeName, payCalc);
        }
    }
}
