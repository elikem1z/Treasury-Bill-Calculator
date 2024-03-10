/**
 * This program calculates the compounded investment value based on user input.
 * It takes the initial investment amount, annual interest rate, compounding intervals per year,
 * contribution per period after the first, and investment duration in periods as input.
 * The program then calculates the final investment value, total contributions, and interest earned.
 * Finally, it outputs the results.
 */
import java.util.Scanner;

class FinancialPlanner {

    // Method to calculate the compounded investment value
    public static double calculateCompoundedValue(double initialInvestment, double annualInterestRate, int compoundingFrequency, double additionalContribution, int investmentDuration) {
        double compoundedAmount = initialInvestment;
        for (int period = 1; period <= investmentDuration; period++) {
            if (period > 1) { // Include additional contributions from second period
                compoundedAmount += additionalContribution;
            }
            compoundedAmount *= (1 + (annualInterestRate / 100) / compoundingFrequency);
        }
        return compoundedAmount;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // Collect investment details from user
        System.out.print("Initial investment amount (¢): ");
        double initialInvestment = inputScanner.nextDouble();
        
        System.out.print("Annual interest rate (%): ");
        double annualInterestRate = inputScanner.nextDouble();
        
        System.out.print("Compounding intervals per year: ");
        int compoundingFrequency = inputScanner.nextInt();
        
        System.out.print("Contribution per period after the first (¢): ");
        double additionalContribution = inputScanner.nextDouble();
        
        System.out.print("Investment duration in periods: ");
        int investmentDuration = inputScanner.nextInt();
        
        // Determine final investment value
        double finalValue = calculateCompoundedValue(initialInvestment, annualInterestRate, compoundingFrequency, additionalContribution, investmentDuration);
        
        // Compute total contributions
        double totalContributions = initialInvestment + additionalContribution * (investmentDuration - 1);
        
        // Calculate interest earned
        double interestEarned = finalValue - totalContributions;
        
        // Output the results
        System.out.printf("Final investment value (¢): %.2f\n", finalValue);
        System.out.printf("Interest earned (¢): %.2f\n", interestEarned);
        
        inputScanner.close();
    }
}
