import java.time.LocalDate;
import java.util.ArrayList;

public class Film2 {
    private String titel;
    private int udgivelsesÅr;
    private ArrayList<Producer2> producers;

    // kontruktør der modtager titel og udgivelsesår
    public Film2 (String titel, int udgivelsesÅr){
        this.titel = titel;
        this.udgivelsesÅr = udgivelsesÅr;
        this.producers = new ArrayList<>();
    }

    // kontruktør der modtager titel, sætter selv år til aktuelle år
    public Film2 (String titel){
        this.titel = titel;
        this.udgivelsesÅr = LocalDate.now().getYear();
        this.producers = new ArrayList<>();
    }

    public String getTitel(){
        return titel;
    }

    public int getUdgivelsesÅr(){
        return udgivelsesÅr;
    }

    public void addProducers (Producer2 producer2){
        producers.add(producer2);
    }

    public ArrayList<Producer2> getProducers() {
        return producers;
    }
}
