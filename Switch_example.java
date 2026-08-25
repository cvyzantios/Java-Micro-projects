import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a character (a, b or c): ");
        char a = scanner.next().charAt(0);  // Παίρνουμε τον πρώτο χαρακτήρα

        switch (a)  // Ελέγχουμε τον χαρακτήρα που έδωσε ο χρήστης
        {
            case 'a':
                System.out.println("A");
                break;

            case 'b':
                System.out.println("B");
                break;

            case 'c':
                System.out.println("C");
                break;

            default:
                System.out.println("No match");
                break;
        }
    }
}