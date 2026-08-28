import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner dataInput = new Scanner(System.in);

        System.out.print("Tell me how many times you want to repeat: ");
        int z = dataInput.nextInt();

        boolean y = true;

        for (int x = 0; y; x++)
        {
            System.out.println("Current value of x = " + x);

            if (x == z - 1)  // We stop in ten repeats...
                y = false;   // When  y false →   for will stop
        }
    }
}