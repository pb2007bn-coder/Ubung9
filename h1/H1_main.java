package h1;

public class H1_main {

    public static void main(String[] args) {

        PrioListe liste = new PrioListe();

        Patient A = new Patient("A", 1);
        Patient B = new Patient("B", 10);
        Patient C = new Patient("C", 5);
        Patient D = new Patient("D", 7);

        liste.addPatient(A);
        liste.addPatient(B);
        liste.addPatient(C);
        liste.addPatient(D);

        // Test: nächster Patient
        Patient next = liste.getNextPatient();
        System.out.println("Next: " + next.getName()); // A

        // Test: Position
        System.out.println("Position von D: " + liste.getPosition(D)); // 1
    }
}
