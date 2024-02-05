/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brigettesetlagotax;



/**
 *
 * @author Capaciti
 */
import java.util.Scanner;
public class BrigetteSetlagoTax {

  
    public static void main(String[] args) {
        // Accept user input for annual income
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        double annualIncome = scanner.nextDouble();

        // Calculate tax
        double tax = calculateTax(annualIncome);

        // Display the result
        System.out.println("Your tax obligation is: R" + tax);

        // Close the scanner
        scanner.close();
    }

    // Tax calculation method 
    private static double calculateTax(double annualIncome) {
        // Tax calculation 
        double taxRate = 0.15; // 15% tax rate
        double tax = annualIncome * taxRate;

        return tax;
    }
}
    

