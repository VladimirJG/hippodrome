package hippodrome_game;

import java.util.List;

public class Hippodrome {
    public static void main(String[] args) {

    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
}