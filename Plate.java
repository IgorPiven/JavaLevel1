package Lesson7;

public class Plate {

    private int food;

    public Plate(int food) {

        if (food < 0) {
            throw new IllegalArgumentException("В миске не может быть отрицательного количества еды");
        }
        this.food = food;

    }

    public void decreaseFood(int n) {

        food -= n;
    }

    public String info() {

        return "В миске " + food + " единиц еды";
    }

    public void fillPlate(int appetite) {
        System.out.println();
        System.out.println("Коты не могут голодать! В миску добавлено " + appetite + " ед.еды");
        food = food + appetite;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {

        this.food = food;
    }

}

