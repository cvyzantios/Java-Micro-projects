import java.util.Scanner;  // Εισάγουμε την κλάση Scanner για είσοδο από το πληκτρολόγιο

class Main
{
    public static void main(String[] args) {

        // Δημιουργούμε ένα αντικείμενο Scanner
        // που διαβάζει δεδομένα από το πληκτρολόγιο
        Scanner scanner = new Scanner(System.in);


        // Δηλώνουμε τη μεταβλητή rawTest
        // η οποία μπορεί να αναφέρεται σε έναν πίνακα float
        float rawTest[];


        // Ζητάμε από τον χρήστη τα δεδομένα
        System.out.print("Give me Multichoice Answers: ");
        int x = scanner.nextInt();

        System.out.print("Give me Total Questions: ");
        int y = scanner.nextInt();

        System.out.print("Give me Correction Answers: ");
        int z = scanner.nextInt();


        // Καλούμε τη μέθοδο testData()
        // και της περνάμε τα x, y, z
        //
        // Η testData() θα δημιουργήσει τον πίνακα
        // και θα τον επιστρέψει
        rawTest = testData(x, y, z);


        // Εμφανίζουμε τα στοιχεία του πίνακα
        //
        // [0] = Multichoice Answers
        // [1] = Total Questions
        // [2] = Correction Answers

        System.out.println("Multichoice Answers: " + rawTest[0]);
        System.out.println("Total Questions: " + rawTest[1]);
        System.out.println("Correction Answers: " + rawTest[2]);
    }


    // Η μέθοδος testData()
    //
    // int x, int y, int z
    // είναι τα PARAMETERS της μεθόδου
    //
    // float[]
    // σημαίνει ότι η μέθοδος θα επιστρέψει έναν πίνακα float
    static float[] testData(int x, int y, int z)
    {

        // Δημιουργούμε έναν πίνακα float
        // και βάζουμε μέσα τις τιμές x, y, z
        float rawTest[] = {x, y, z};


        // Επιστρέφουμε τον πίνακα στη main()
        return rawTest;
    }
}