package galactic;
import java.util.Scanner;
public class GalacticAddition {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the numbers");
	long num1 = scan.nextLong();
	long num2 = scan.nextLong();
	long result = ArithmeticAddition(num1,num2);
	System.out.println("The result is: "+result);
}
public static long ArithmeticAddition(long num1, long num2) {
	return num1+num2;
}
}
