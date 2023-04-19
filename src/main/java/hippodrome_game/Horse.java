package hippodrome_game;

public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    //В методе move класса Horse значение поля distance должно увеличиваться на расстояние
    // пройденное за один "ход"(значение поля speed) умноженное на случайное число от нуля до
    // единицы полученное с помощью вызова метод Math.random().
    public void move() {
        distance += speed * Math.random();
    }

    public void print() {
        for (int i = 0; i < Math.floor(distance); i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }
}
