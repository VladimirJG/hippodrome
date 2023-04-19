package hippodrome_game;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) {
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("horse1", 3, 0));
        horseList.add(new Horse("horse2", 3, 0));
        horseList.add(new Horse("horse3", 3, 0));

        Hippodrome hippodrome = new Hippodrome(horseList);
        game = hippodrome;
    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    static Hippodrome game;

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
//В методе move класса Hippodrome
// должен быть вызван метод move(Horse) по одному разу для каждой лошади(каждого элемента списка horses).
    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
