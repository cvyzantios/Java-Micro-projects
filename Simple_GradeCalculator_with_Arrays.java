import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Ask for the first grade
        System.out.println("Insert the first Grade:");
        int x = scanner.nextInt();

        // Ask for the second grade
        System.out.println("Insert the second Grade:");
        int y = scanner.nextInt();

        // Store both grades in an array
        float rawTest[] = {x, y};

        // Declare the final grade and the correction factor
        double finaleGrade;
         
         
         System.out.println("Give the appropriate curve:");
        float z = scanner.nextFloat();

        
        
        double curve = z;

        // Call calcGrade() and apply the correction factor
        finaleGrade = curve * calcGrade(rawTest);

        // Display the final result
        System.out.println("Your final grade is " + finaleGrade);

        scanner.close();
    }

    // Calculate the percentage
    static float calcGrade(float test[])
    {
        return (test[0] / test[1]) * 100;
    }
}