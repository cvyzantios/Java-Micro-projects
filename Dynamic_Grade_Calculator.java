import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    // Create a Scanner object for keyboard input
    // Δημιουργούμε ένα αντικείμενο Scanner για είσοδο από το πληκτρολόγιο
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Control the repetition of the entire process
        // Ελέγχουμε αν θα επαναληφθεί ολόκληρη η διαδικασία
        boolean repeat = true;

        while (repeat)
        {
            // Create empty dynamic lists
            // Δημιουργούμε κενές δυναμικές λίστες
            ArrayList<String> subjects = new ArrayList<>();
            ArrayList<Float> percentages = new ArrayList<>();

            System.out.println("\n=== GRADE CALCULATOR ===");
            System.out.println("Enter STOP when you finish adding subjects.");
            System.out.println("Γράψτε STOP όταν τελειώσετε με τα μαθήματα.\n");

            // Repeat until the user enters STOP
            // Επαναλαμβάνουμε μέχρι ο χρήστης να γράψει STOP
            while (true)
            {
                System.out.print("Enter subject name (or STOP): ");

                // Read the subject name
                // Διαβάζουμε το όνομα του μαθήματος
                String subject = scanner.nextLine().trim();

                // Stop adding subjects
                // Σταματάμε την εισαγωγή μαθημάτων
                if (subject.equalsIgnoreCase("STOP"))
                {
                    break;
                }

                // Reject an empty subject name
                // Απορρίπτουμε το κενό όνομα μαθήματος
                if (subject.isEmpty())
                {
                    System.out.println("Name cannot be empty. Try again.");
                    System.out.println("Το όνομα δεν μπορεί να είναι κενό.\n");
                    continue;
                }

                // Read the points earned
                // Διαβάζουμε τους βαθμούς που συγκέντρωσε ο χρήστης
                float earned = readNumber("Enter points earned: ");

                // Read the maximum available points
                // Διαβάζουμε το σύνολο των διαθέσιμων βαθμών
                float total;

                while (true)
                {
                    total = readNumber("Enter total available points: ");

                    // The total must be greater than zero
                    // Το σύνολο πρέπει να είναι μεγαλύτερο από το μηδέν
                    if (total > 0 && earned <= total)
                    {
                        break;
                    }

                    System.out.println(
                        "Invalid values. Total must be positive and at least the earned points."
                    );
                    System.out.println(
                        "Μη έγκυρες τιμές. Το σύνολο πρέπει να είναι θετικό και τουλάχιστον ίσο με τους βαθμούς που πήρατε."
                    );
                }

                // Store the subject name
                // Αποθηκεύουμε το όνομα του μαθήματος
                subjects.add(subject);

                // Store the percentage calculated by the method
                // Αποθηκεύουμε το ποσοστό που υπολογίζει η μέθοδος
                float[] test = {earned, total};
                percentages.add(calcGrade(test));

                System.out.println("Subject added successfully!");
                System.out.println("Το μάθημα προστέθηκε επιτυχώς.\n");
            }

            // Check whether at least one subject was entered
            // Ελέγχουμε αν εισήχθη τουλάχιστον ένα μάθημα
            if (subjects.isEmpty())
            {
                System.out.println("No subjects entered. Try again.");
                System.out.println("Δεν εισήχθη κανένα μάθημα. Προσπαθήστε ξανά.");
                continue;
            }

            // Display the results for all subjects
            // Εμφανίζουμε τα αποτελέσματα όλων των μαθημάτων
            System.out.println("\n=== SUBJECT RESULTS ===");

            float sum = 0;

            for (int i = 0; i < subjects.size(); i++)
            {
                System.out.println(
                    subjects.get(i) + ": " + percentages.get(i) + "%"
                );

                // Add the percentage to the total
                // Προσθέτουμε το ποσοστό στο συνολικό άθροισμα
                sum += percentages.get(i);
            }

            // Calculate the average percentage
            // Υπολογίζουμε τον μέσο όρο των ποσοστών
            float average = sum / percentages.size();

            // Ask for the correction factor
            // Ζητάμε τον συντελεστή διόρθωσης
            float curve;

            while (true)
            {
                curve = readNumber("Enter correction factor (e.g. 1.0): ");

                // The correction factor must be positive
                // Ο συντελεστής διόρθωσης πρέπει να είναι θετικός
                if (curve > 0)
                {
                    break;
                }

                System.out.println("The factor must be positive. Try again.");
                System.out.println("Ο συντελεστής πρέπει να είναι θετικός. Προσπαθήστε ξανά.");
            }

            // Apply the correction factor to the average
            // Εφαρμόζουμε τον συντελεστή διόρθωσης στον μέσο όρο
            double finaleGrade = curve * average;

            // Display the final result
            // Εμφανίζουμε το τελικό αποτέλεσμα
            System.out.println("\nAverage percentage: " + average + "%");
            System.out.println("Final result after correction: " + finaleGrade);

            // Ask whether the user wants to repeat the process
            // Ρωτάμε αν ο χρήστης θέλει να επαναλάβει τη διαδικασία
            while (true)
            {
                System.out.print("\nDo you want to calculate again? (yes/no): ");
                String answer = scanner.nextLine().trim();

                // Continue with a new calculation
                // Συνεχίζουμε με νέο υπολογισμό
                if (answer.equalsIgnoreCase("yes") ||
                    answer.equalsIgnoreCase("y"))
                {
                    repeat = true;
                    break;
                }

                // End the program
                // Τερματίζουμε το πρόγραμμα
                if (answer.equalsIgnoreCase("no") ||
                    answer.equalsIgnoreCase("n"))
                {
                    repeat = false;
                    break;
                }

                // Handle an invalid answer
                // Διαχειριζόμαστε μια μη έγκυρη απάντηση
                System.out.println("Please enter yes or no.");
                System.out.println("Παρακαλώ γράψτε yes ή no.");
            }
        }

        // Close the Scanner when the program finishes
        // Κλείνουμε το Scanner όταν τελειώσει το πρόγραμμα
        scanner.close();

        System.out.println("\nProgram finished. Goodbye!");
        System.out.println("Το πρόγραμμα ολοκληρώθηκε. Αντίο!");
    }

    // Read a valid numerical value from the user
    // Διαβάζουμε μια έγκυρη αριθμητική τιμή από τον χρήστη
    static float readNumber(String message)
    {
        while (true)
        {
            System.out.print(message);

            // Read the input as text
            // Διαβάζουμε την είσοδο ως κείμενο
            String input = scanner.nextLine().trim();

            try
            {
                // Convert the text into a float number
                // Μετατρέπουμε το κείμενο σε αριθμό float
                float number = Float.parseFloat(input);

                // Reject NaN and infinite values
                // Απορρίπτουμε τις τιμές NaN και το άπειρο
                if (Float.isFinite(number))
                {
                    return number;
                }
            }
            catch (NumberFormatException e)
            {
                // Handle input that is not a valid number
                // Διαχειριζόμαστε είσοδο που δεν είναι έγκυρος αριθμός
            }

            // Ask the user to try again
            // Ζητάμε από τον χρήστη να προσπαθήσει ξανά
            System.out.println("Invalid number. Please try again.");
            System.out.println("Μη έγκυρος αριθμός. Προσπαθήστε ξανά.");
        }
    }

    // Calculate the percentage for one subject
    // Υπολογίζουμε το ποσοστό για ένα μάθημα
    static float calcGrade(float test[])
    {
        return (test[0] / test[1]) * 100;
    }
}
















