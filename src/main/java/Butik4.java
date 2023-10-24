import java.util.ArrayList;

public class Butik4 {
    private ArrayList<Cykel4> lagerliste = new ArrayList<>();

    public void tilføjCykel(Cykel4 cykel4){
        lagerliste.add(cykel4);
    }

    public ArrayList<Cykel4> getLagerliste() {
        return lagerliste;
    }

    //metoden for at returnere den samlede pris
    public double samletLagerBeholdning(){
        double samletPris = 0;
        for (Cykel4 cykel4 : lagerliste){
            samletPris += cykel4.getPris();
        }
        return samletPris;
    }
}
