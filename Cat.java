package Lesson7;

public class Cat {

    private String name;
    private String animalType = "Кот";
    private int appetite;
    private boolean catFullness;
    Fullness fullness = new Fullness();


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.catFullness = catFullness;
    }

    public void eat(Plate p) {

        System.out.println(animalType + " " + name + " подошел к миске");

        catFullness = fullness.isBellyStuffed(p, appetite, catFullness, name, animalType);


        System.out.println(p.info());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
