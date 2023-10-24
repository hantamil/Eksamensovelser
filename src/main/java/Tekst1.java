import java.util.ArrayList;
import java.util.Collections;

public class Tekst1 {
    //private String[] tekstLinjer;
    // i del 3 skal vi add, derfor giver det bedre mening at lave en arraylist. Forskellen på de to metoder er at vi skal vide hvor lang String[] skal være dsv en statisk
    // liste. I array er det ikke en statisk liste dvs en dynamisk liste.

    // private = incapsulation så det ikke roder med andre klasser eller steder
    private ArrayList<String> tekstLinjer = new ArrayList<>();

    //stringen er parameter til tilføj-metoden
    public void tilføj(String linje){
        tekstLinjer.add(linje);
    }

    //ekstra
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (String tekst : tekstLinjer){
            string.append(tekst+"\n");
        }
        return string.toString().trim();
    }

    // kristoffers måde med collections. langsommere, men bedre til store mængder. Fylder mere på computeren.
    public int findAntalUnikke(){
        Collections.sort(tekstLinjer);
        int nummer = 0;

        for(int i = 0; i < tekstLinjer.size(); i++){
            if (i == 0){
                nummer++;
            }
            else{
                if(!tekstLinjer.get(i).equals(tekstLinjer.get(i-1))){
                  nummer++;
                }
            }
        }
        return nummer;
    }

    // hurtigere, men dårligere til store mængder data. Kan ikke få den til at virke??
   /* public int findAntalUnikke(){
        int resultat;
        ArrayList<String> tjekLinjer = new ArrayList<>();
        for (String tekst : tjekLinjer){
            if (!tjekLinjer.contains(tekst)){
                tjekLinjer.add(tekst);
            }
        }
        resultat = tjekLinjer.size();
        return resultat;
    }*/

}
