package power;
import java.util.Scanner;
public class PowerOfSquares {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int number = scan.nextInt();
	System.out.println(PowerOfApp.PowerSquareApp(number));
	
}
}
