package half;
import java.util.Scanner;
public class MakeItHalf{
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter number :");
        double number = scan.nextDouble();
        System.out.printf("result is %.2f",halveTheNumber(number));
    }
    public static double halveTheNumber(double num) {
        return num / 2;
    }
}
