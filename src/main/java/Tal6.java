import java.util.ArrayList;
import java.util.List;

public class Tal6 {
    private List<Integer> talListe;

    public Tal6(){
        this.talListe = new ArrayList<>();
    }

    public int tælTal(int tal){
        int gentagelser = 0;
        for (int i : talListe){
            if (i == tal){
                gentagelser++;
            }
        }
        return gentagelser;
    }

    public double gennemsnit(){
        if (talListe.isEmpty()){
            return 0;
        }
        int total = 0;
        for (int t : talListe){
            total += t;
        }
        return total / talListe.size();
    }
}
