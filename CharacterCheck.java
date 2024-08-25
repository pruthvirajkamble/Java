import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) 
		{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase letter" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase letter" :
                        (ch >= '0' && ch <= '9') ? "Digit" :"Neither uppercase, lowercase, nor digit";

        System.out.println("The character is: " + result);
    }
}
