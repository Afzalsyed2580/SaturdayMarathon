package Secret;
import java.util.Scanner;
public class MessageDecoder{
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any alphabet :");
        SecretA decoder = new SecretA();
        char character = scan.next().charAt(0);
        int unicode = decoder.decodeCharacter(character);
        System.out.println("Unicode: " + unicode);
    }
}

