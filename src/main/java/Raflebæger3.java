import java.util.ArrayList;
import java.util.List;

public class Raflebæger3 {
    private int terningerIBæger;
    private List<Integer> terninger;

    //kontruktør. Heltal som argument, angiver antallet af terninger i bægeret.
    // Opretter bagefter en liste af terninger med random øjne.
    public Raflebæger3 (int terningerIBæger){
        this.terningerIBæger = terningerIBæger;
        this.terninger = new ArrayList<>();
        for (int i = 0; i < terningerIBæger; i++){
            terninger.add(1 + (int) (Math.random() * 6));
        }
    }
    public int ryst(){
        int sum = 0;
        for (int i = 0; i < terningerIBæger; i++) {
            int øjne = 1 + (int) (Math.random() * 6);
            terninger.set(i, øjne);
            sum += øjne;
        }
        return sum;
    }

    public List<Integer> se() {
        return terninger;
    }
}
