// Αρχείο: Main.java
import java.util.Scanner;

// Η κλάση Main περιέχει το σημείο από όπου ξεκινά η εκτέλεση του προγράμματος.
// The Main class contains the program's entry point.
public class Main {

    public static void main(String[] args) {

        // Δημιουργούμε αντικείμενο Scanner για την ανάγνωση εισόδου από το πληκτρολόγιο.
        // Create a Scanner object for reading input from the keyboard.
        Scanner scanner = new Scanner(System.in);

        // Δημιουργούμε ένα νέο αντικείμενο τύπου Cat.
        // Create a new Cat object.
        Cat cat1 = new Cat();

        // Ζητάμε από τον χρήστη να πληκτρολογήσει το όνομα της πρώτης γάτας στα αγγλικά.
        // Prompt the user to enter the first cat's name in English.
        System.out.print("Enter the name of the first cat: ");
        
        // Διαβάζουμε το όνομα από την είσοδο και το αναθέτουμε στη μεταβλητή name.
        // Read the name from input and assign it to the name variable.
        cat1.name = scanner.nextLine();

        // Καλούμε τη μέθοδο niaou() του αντικειμένου cat1.
        // Call the niaou() method of cat1.
        cat1.niaou();


        // Δημιουργούμε έναν πίνακα που μπορεί να αποθηκεύσει 3 αναφορές σε αντικείμενα τύπου Cat.
        // Create an array that can hold 3 Cat object references.
        Cat[] myCats = new Cat[3];

        // Δημιουργούμε μια νέα γάτα και αποθηκεύουμε την αναφορά της στη θέση 0.
        // Create a new Cat object and store its reference at index 0.
        myCats[0] = new Cat();

        // Δημιουργούμε μια δεύτερη γάτα στη θέση 1.
        // Create another Cat object at index 1.
        myCats[1] = new Cat();

        // Αποθηκεύουμε στη θέση 2 την αναφορά στο ήδη υπάρχον αντικείμενο cat1.
        // Store the reference to the existing cat1 object at index 2.
        myCats[2] = cat1;


        // Ζητάμε από τον χρήστη ονόματα για τις δύο πρώτες γάτες του πίνακα στα αγγλικά.
        // Prompt the user to enter names for the first two cats in the array in English.
        System.out.print("Enter name for cat at index 0: ");
        myCats[0].name = scanner.nextLine();

        System.out.print("Enter name for cat at index 1: ");
        myCats[1].name = scanner.nextLine();


        // Εμφανίζουμε το όνομα της γάτας στη θέση 2 (που είναι η cat1).
        // Display the name of the cat at index 2 (which is cat1).
        System.out.println("last cat's name is " + myCats[2].name);


        // Αρχικοποιούμε τον μετρητή του βρόχου.
        // Initialize the loop counter.
        int x = 0;

        // Επανάλαβε όσο το x είναι μικρότερο από το μήκος του πίνακα.
        // Repeat while x is smaller than the array length.
        while (x < myCats.length) {

            // Καλούμε τη niaou() της γάτας στην τρέχουσα θέση του πίνακα.
            // Call niaou() for the cat at the current index.
            myCats[x].niaou();

            // Αυξάνουμε το x κατά 1 για να πάμε στην επόμενη θέση.
            // Increase x by 1 to move to the next array position.
            x = x + 1;
        }

        // Κλείνουμε το αντικείμενο scanner.
        // Close the scanner object.
        scanner.close();
    }
}


// Η κλάση Cat ορίζει τις ιδιότητες και τις συμπεριφορές μιας γάτας.
// The Cat class defines the properties and behaviors of a cat.
class Cat {

    // Μια μεταβλητή String που αποθηκεύει το όνομα της γάτας.
    // A String variable that stores the cat's name.
    String name;


    // Ορίζουμε μια μέθοδο που κάνει τη γάτα να νιαουρίζει.
    // Define a method that makes the cat meow.
    public void niaou() {

        // Εμφανίζουμε το όνομα της γάτας και στη συνέχεια το " Niaou".
        // Print the cat's name followed by " Niaou".
        System.out.println(name + " Niaou");
    }


    // Κενή μέθοδος - προς το παρόν δεν εκτελεί καμία ενέργεια.
    // Empty method - it currently performs no action.
    public void Dog() {}


    // Κενή μέθοδος - προς το παρόν δεν εκτελεί καμία ενέργεια.
    // Empty method - it currently performs no action.
    public void DirtyDog() {}
}



/*
============================================================
JAVA OBJECTS, ARRAYS AND INPUT — CAT CLASS EXAMPLE
ΑΝΤΙΚΕΙΜΕΝΑ, ΠΙΝΑΚΕΣ ΚΑΙ ΕΙΣΟΔΟΣ ΣΤΗ JAVA — ΠΑΡΑΔΕΙΓΜΑ ΚΛΑΣΗΣ CAT
============================================================

1. USER INPUT — ΕΙΣΟΔΟΣ ΧΡΗΣΤΗ

ENGLISH:
The Scanner class from java.util package is used to read dynamic input 
entered by the user from the keyboard via 'scanner.nextLine()'.

ΕΛΛΗΝΙΚΑ:
Η κλάση Scanner από το πακέτο java.util χρησιμοποιείται για την ανάγνωση
δυναμικών δεδομένων που πληκτρολογεί ο χρήστης μέσω της 'scanner.nextLine()'.


2. CLASSES AND OBJECTS — ΚΛΑΣΕΙΣ ΚΑΙ ΑΝΤΙΚΕΙΜΕΝΑ

ENGLISH:
The Cat class defines the properties and behaviors of a cat.
The variable 'name' stores the cat's name dynamically provided by the user.
The niaou() method displays the cat's name followed by a sound.

ΕΛΛΗΝΙΚΑ:
Η κλάση Cat ορίζει τις ιδιότητες και τις συμπεριφορές μιας γάτας.
Η μεταβλητή 'name' αποθηκεύει το όνομα της γάτας που δίνει ο χρήστης.
Η μέθοδος niaou() εμφανίζει το όνομά της μαζί με έναν ήχο.


3. ARRAYS AND REFERENCES — ΠΙΝΑΚΕΣ ΚΑΙ ΑΝΑΦΟΡΕΣ

ENGLISH:
The array 'myCats' stores references to Cat objects.
Assigning 'myCats[2] = cat1' means both 'cat1' and 'myCats[2]' point to 
the exact same object in memory.

ΕΛΛΗΝΙΚΑ:
Ο πίνακας 'myCats' αποθηκεύει αναφορές σε αντικείμενα Cat.
Η ανάθεση 'myCats[2] = cat1' σημαίνει ότι τόσο η 'cat1' όσο και η 'myCats[2]'
δείχνουν στο ίδιο ακριβώς αντικείμενο στη μνήμη.


4. WHILE LOOP — ΒΡΟΧΟΣ WHILE

ENGLISH:
The while loop iterates through the 'myCats' array and calls 'niaou()'
for each cat reference stored in the array.

ΕΛΛΗΝΙΚΑ:
Ο βρόχος while διατρέχει τον πίνακα 'myCats' και καλεί τη μέθοδο 'niaou()'
για κάθε αναφορά γάτας που είναι αποθηκευμένη στον πίνακα.
*/