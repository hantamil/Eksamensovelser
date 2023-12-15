import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tal5 {
    private List<Integer> tilfældigeTal = new ArrayList<>();
    private Random random = new Random();

    public int tilfældigTal() {
        int tilfældigtTal = random.nextInt(5) + 1;
        return tilfældigtTal;
    }

    public void lavMangeTal() {
        tilfældigeTal.clear();
        for (int i = 0; i < 10; i++) {
            int tilfældigtTal = tilfældigTal();
            tilfældigeTal.add(tilfældigtTal); // så tallene gemmes i listen
        }
    }

    public List<Integer> getTilfældigeTal() {
        return tilfældigeTal;
    }
}
