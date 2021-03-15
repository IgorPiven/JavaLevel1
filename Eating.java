package Lesson7;


import java.util.Arrays;
import java.util.List;

public class Eating {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Барсик", 15);
        cats[1] = new Cat("Рыжик", 20);
        cats[2] = new Cat("Васька", 30);

        Plate plate = new Plate(40);

        List<Cat> eating = Arrays.asList(cats);

        System.out.println(plate.info());
        System.out.println();

        for (Cat i : eating) {
            i.eat(plate);

        }

        // Дополнительные условия для котов
        cats[0].eat(plate);
        cats[2].eat(plate);
        cats[1].eat(plate);

    }
}


