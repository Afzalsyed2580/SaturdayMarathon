package planet;
import java.util.Scanner;
public class PlanetExplorer {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the radius :");
        PlanetExplorer explorer = new PlanetExplorer();
        double radius = scan.nextDouble();
        double surfaceArea = explorer.calculateSurfaceArea(radius);
        System.out.printf("Area is %.2f",surfaceArea);
    }
    public double calculateSurfaceArea(double radius) {
        return 4 * 3.14*(radius*radius);
    }
}
