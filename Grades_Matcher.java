import java.util.Scanner;   // Για είσοδο από το πληκτρολόγιο
import java.util.Arrays;    // Για σύγκριση arrays


class Main
{
    // Ο Scanner είναι εδώ, στην κλάση,
    // ώστε να μπορούν να τον χρησιμοποιούν
    // και η main() και η studentGrades()
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        // ==============================
        // STUDENT 1
        // ==============================

        // Καλούμε τη studentGrades()
        // Η μέθοδος θα ζητήσει 3 βαθμούς
        // και θα μας επιστρέψει ένα int[]
        int[] student1Grades = studentGrades();


        // ==============================
        // STUDENT 2
        // ==============================

        // Καλούμε ΞΑΝΑ την ίδια μέθοδο
        // Αυτή τη φορά για τον Student 2
        int[] student2Grades = studentGrades();


        // ==============================
        // ΣΥΓΚΡΙΣΗ
        // ==============================

        // Arrays.equals() συγκρίνει τα περιεχόμενα
        // των δύο arrays
        if (Arrays.equals(student1Grades, student2Grades))
        {
            System.out.println("Match");
        }
        else
        {
            System.out.println("No Match");
        }
    }


    // ==================================================
    // METHOD: studentGrades()
    // ==================================================

    // static  -> μπορούμε να την καλέσουμε από τη static main()
    // int[]   -> επιστρέφει έναν πίνακα ακεραίων
    // ()      -> δεν παίρνει parameters
    static int[] studentGrades()
    {
        // Ζητάμε τον πρώτο βαθμό
        System.out.print("Give First Grade: ");
        int x = scanner.nextInt();


        // Ζητάμε τον δεύτερο βαθμό
        System.out.print("Give Second Grade: ");
        int y = scanner.nextInt();


        // Ζητάμε τον τρίτο βαθμό
        System.out.print("Give Third Grade: ");
        int z = scanner.nextInt();


        // Δημιουργούμε έναν πίνακα
        // και βάζουμε μέσα τους 3 βαθμούς
        int[] grades = {x, y, z};


        // Επιστρέφουμε τον πίνακα
        // στη main()
        return grades;
    }
}
