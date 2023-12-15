import java.util.ArrayList;
import java.util.List;

public class Keyword7 {
    private String word;
    private String definition;

    public Keyword7(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public boolean matches(String input){
        return input.toLowerCase().contains(word.toLowerCase());
    }

   /* public String matches(String input){
        if (!input.toLowerCase().contains(word.toLowerCase())){
            System.out.println("This word or word containing the entered letters does not exist.");
        }
        return input + " matches the word: " + word;
    }*/
}
