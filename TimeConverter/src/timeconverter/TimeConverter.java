package timeconverter;
import java.util.Scanner;
public class TimeConverter{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter time in minutes");
    int minutes = scan.nextInt();
    double hours = convertToHours(minutes);
    System.out.printf("%.2f hours", hours);
}
public static double convertToHours(double minutes) {
    return minutes / 60;
}
}