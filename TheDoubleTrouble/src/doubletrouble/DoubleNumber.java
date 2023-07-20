package doubletrouble;
import java.util.Scanner;
public class DoubleNumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println(DoubleTheNumber(num));
		
	}
	public static int DoubleTheNumber(int num) {
		return num * 2;
	}
	}
