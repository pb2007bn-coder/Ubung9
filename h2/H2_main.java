package h2;

public class H2_main {

    public static void main(String[] args) {

        Bus busA = new Bus();
        Bus busB = new Bus();

        Passenger anna = new Passenger("Anna", 2, true);
        Passenger ben = new Passenger("Ben", 3, true);
        Passenger clara = new Passenger("Clara", 1, false);

        // Passagiere steigen ein
        busA.enterBus(anna);
        busA.enterBus(ben);
        busA.enterBus(clara);

        System.out.println("=== Start: Bus A ===");
        printBus(busA);

        // 1. Haltestelle
        System.out.println("\n=== Nächste Haltestelle ===");
        busA.nextStop();
        printBus(busA);

        // Schwarzfahrer finden
        System.out.println("\n=== Schwarzfahrer entfernen ===");
        busA.findPassengersWithoutTickets();
        printBus(busA);

        // Umsteigen
        System.out.println("\n=== Umsteigen Anna & Clara nach Bus B ===");
        String[] names = {"Anna", "Clara"};
        busA.transferPassengers(busB, names);
        System.out.println("Bus A nach Umsteigen:");
        printBus(busA);
        System.out.println("Bus B nach Umsteigen:");
        printBus(busB);

        // 2. Haltestelle, neue Passagiere
        Passenger david = new Passenger("David", 2, true);
        Passenger emma = new Passenger("Emma", 1, true);
        Passenger[] newBoarding = {david, emma};

        System.out.println("\n=== Nächste Haltestelle, neue Passagiere zusteigen ===");
        busA.nextStop(newBoarding);
        System.out.println("Bus A nach Boarding:");
        printBus(busA);
    }

    // Hilfsmethode für Testausgabe
    public static void printBus(Bus bus) {
        try {
            java.lang.reflect.Field f = Bus.class.getDeclaredField("passenger");
            f.setAccessible(true);
            java.util.ArrayList<Passenger> list = (java.util.ArrayList<Passenger>) f.get(bus);

            if (list.isEmpty()) {
                System.out.println("Bus ist leer.");
                return;
            }

            for (Passenger p : list) {
                System.out.println(p.getName() + " | visited: " + p.getVisited() + " | planned: " + p.getPlanned() + " | ticket: " + p.hasTicket());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
