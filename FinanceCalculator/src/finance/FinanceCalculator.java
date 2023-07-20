package finance;

import java.util.Scanner;

public class FinanceCalculator {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time;
    }

    public static void main(String[] args) {
        FinanceCalculator calculator = new FinanceCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in decimal): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple Interest: " + String.format("%.2f", simpleInterest));

        scanner.close();
    }
}
