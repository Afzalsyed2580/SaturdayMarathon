package cubic;

import java.util.Scanner;
public class CubeMystery {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int number = scan.nextInt();
	System.out.println(CubeMysteryApp.CubeApp(number));
	
}
}
