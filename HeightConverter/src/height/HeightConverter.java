package height;
import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter height in inches :");
        HeightConverter converter = new HeightConverter();
        double inches = scan.nextDouble();
        double feet = converter.convertInchesToFeet(inches);
        System.out.println("Feet: " + String.format("%.2f", feet));
    }
    public double convertInchesToFeet(double inches) {
        return inches / 12.0;
    }
}

