package arrays;
import java.util.Scanner;
public class Height {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	float [][]arr = new float[4][3];
	for (int i = 0;i<=arr.length-1;i++) {
		for (int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter height of sport "+i+" of height "+j);
			arr[i][j] = scan.nextFloat();
		}
		System.out.println();
	}
	System.out.println("The height of the players are: ");
	for (int i = 0;i<=arr.length-1;i++) {
		for (int j=0;j<=arr[i].length-1;j++) {
			System.out.println(arr[i][j]+" ");
			}
	}
}
}
