import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main
{
    // Create a Scanner object for keyboard input
    // Δημιουργούμε ένα αντικείμενο Scanner για είσοδο από το πληκτρολόγιο
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Create an empty dynamic list of names
        // Δημιουργούμε μια κενή δυναμική λίστα ονομάτων
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names one by one.");
        System.out.println("Type STOP when you want to finish.");
        System.out.println();

        // Repeat until the user types STOP
        // Επαναλαμβάνουμε μέχρι ο χρήστης να γράψει STOP
        while (true)
        {
            // Ask the user to enter a name
            // Ζητάμε από τον χρήστη να εισάγει ένα όνομα
            System.out.print("Give me a name: ");

            // Read the name entered by the user
            // Διαβάζουμε το όνομα που έδωσε ο χρήστης
            String name = scanner.nextLine();

            // Check if the user wants to stop entering names
            // Ελέγχουμε αν ο χρήστης θέλει να σταματήσει την εισαγωγή ονομάτων
            if (name.equalsIgnoreCase("STOP"))
            {
                // Exit the while loop
                // Βγαίνουμε από το while
                break;
            }

            // Add the name to the dynamic list
            // Προσθέτουμε το όνομα στη δυναμική λίστα
            names.add(name);
        }

        // Sort the names alphabetically
        // Ταξινομούμε τα ονόματα αλφαβητικά
        Collections.sort(names);

        System.out.println();
        System.out.println("Names entered:");

        // Display all names in the list
        // Εμφανίζουμε όλα τα ονόματα της λίστας
        for (String name : names)
        {
            System.out.println(name);
        }

        System.out.println();

        // Start the name search loop
        // Ξεκινάμε το loop για την αναζήτηση ονομάτων
        while (true)
        {
            // Ask which name the user wants to find
            // Ρωτάμε ποιο όνομα θέλει να αναζητήσει
            System.out.print("Which name do you want to find? ");

            // Read the name to search for
            // Διαβάζουμε το όνομα που θέλει να ψάξει
            String searchName = scanner.nextLine();

            // Search for the name in the sorted list
            // Ψάχνουμε το όνομα μέσα στην ταξινομημένη λίστα
            int index = Collections.binarySearch(names, searchName);

            // Check if the name was found
            // Ελέγχουμε αν βρέθηκε το όνομα
            if (index >= 0)
            {
                System.out.println(
                    searchName + " is in list element: " + index
                );
            }
            else
            {
                // The name was not found
                // Το όνομα δεν βρέθηκε
                System.out.println(
                    searchName + " was not found."
                );
            }

            System.out.println();

            // Ask the user if they want to search again
            // Ρωτάμε τον χρήστη αν θέλει να κάνει άλλη αναζήτηση
            System.out.print(
                "Do you want to search for another name? (yes/no): "
            );

            // Read the user's answer
            // Διαβάζουμε την απάντηση του χρήστη
            String answer = scanner.nextLine();

            // Check if the user wants to stop searching
            // Ελέγχουμε αν ο χρήστης θέλει να σταματήσει την αναζήτηση
            if (answer.equalsIgnoreCase("no") ||
                answer.equalsIgnoreCase("n"))
            {
                // Exit the search loop
                // Βγαίνουμε από το loop αναζήτησης
                break;
            }
        }

        // Program finished
        // Το πρόγραμμα ολοκληρώθηκε
        System.out.println();
        System.out.println("Program finished.");
    }
}