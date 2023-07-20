package journey;
import java.util.Scanner;
public class JourneyCalculator {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Speed :");
	double speed = scan.nextDouble();
	System.out.println("Enter time :");
	double time = scan.nextDouble();
	JourneyCalculatrApp journeycalculator = new JourneyCalculatrApp();
	double result = journeycalculator.calculateDistance(speed,time);
	System.out.printf("%.2f",result);
}
	
}

