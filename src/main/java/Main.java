import java.util.List;
import java.util.Scanner;

public class Main {

    // TEKST - ØVELSE 1
   /* public static void main(String[] args) {
        Tekst1 tekst = new Tekst1();
        tekst.tilføj("Hello world");
        tekst.tilføj("Hello world");
        tekst.tilføj("Hello class");

        System.out.println(tekst);
        System.out.println("Antal unikke linjer: "+tekst.findAntalUnikke());
    }*/

    // FILM - ØVELSE 2
   /* public static void main(String[] args) {
        Film2 film = new Film2("King Kong", 2005);
        Producer2 producer2 = new Producer2("Peter Jackson");

        film.addProducers(producer2);

        System.out.println("Filmtitel: " + film.getTitel());
        System.out.println("Udgivelsesår: " + film.getUdgivelsesÅr());
        System.out.println("Producer: ");
        for (Producer2 producer : film.getProducers()){
            System.out.println(producer.getProducer());
        }
    }*/

    // RAFLEBÆGER - ØVELSE 3
   /* public static void main(String[] args) {
        int terningerIBæger = 5;
        Raflebæger3 raflebæger = new Raflebæger3(terningerIBæger);
        System.out.println("Velkommen til Raflebægeret!\n" +
                "Vil du ryste bægeret?(j/n)");

        Scanner input = new Scanner(System.in);
        String valg = input.nextLine();

        switch (valg) {
            case "j":
                int sumRyst = raflebæger.ryst();
                System.out.println("Terning sum efter ryst: " + sumRyst);
                System.out.println();
                break;
            case "n":
                List<Integer> sumUdenRyst = raflebæger.se();
                System.out.println("Terning sum uden ryst: ");
                break;
            default:
                System.out.println("Ugyldig indtastning.");
        }
    }*/

    // CYKLER - ØVELSE 4
    /*public static void main(String[] args) {
        Butik4 butik = new Butik4();

        Cykel4 cykel1 = new Cykel4("Trek", "Sort", 5500);
        Cykel4 cykel2 = new Cykel4("Giant", "Grøn", 4800);
        Cykel4 cykel3 = new Cykel4("Pinepeak", "Lyserød", 900);
        Cykel4 cykel4 = new Cykel4("Mustang", "Orange", 3000);

        butik.tilføjCykel(cykel1);
        butik.tilføjCykel(cykel2);
        butik.tilføjCykel(cykel3);
        butik.tilføjCykel(cykel4);

        double samletPris = butik.samletLagerBeholdning();
        System.out.println("Samlet værdi af lager beholdning: " + samletPris + "kr\n");
        System.out.println("Liste over cykler på lager:");
        for (Cykel4 cykel : butik.getLagerliste())
        System.out.println("Mærke: " + cykel.getMærke() +
                ", Farve: " + cykel.getFarve() +
                ", Pris: " + cykel.getPris());
    }*/

    // TAL - ØVELSE 5
    public static void main(String[] args) {
        Tal5 tal = new Tal5();

    }
}
