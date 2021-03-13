package Lesson6;

public abstract class Animal {

    protected String name;
    protected String animalType;
    protected int animalRunDistanceLimit;
    protected int animalSwimDistanceLimit;

    private int distanceMade;
    private int actionDistanceLimit;
    private String actionType1;
    private String actionType2;

    public Animal(String name) {
        this.name = name;
        this.animalType = animalType;
        this.animalRunDistanceLimit = animalRunDistanceLimit;
        this.animalSwimDistanceLimit = animalSwimDistanceLimit;
    }

    public void swim() { System.out.println(animalType + " " + name + " плывет"); }

    public void run() {
        System.out.println(animalType + " " + name + " бежит");
    }


    public void swim(int distanceSwim) {
        actionType1 = "проплыла";
        actionType2 = "проплыть";
        System.out.println(checkAction(distanceSwim, animalSwimDistanceLimit, actionType1, actionType2));

    }

    public void run(int distanceRun) {
        actionType1 = "пробежала";
        actionType2 = "пробежать";
        System.out.println(checkAction(distanceRun, animalRunDistanceLimit, actionType1, actionType2));

    }

    private String checkAction(int distanceMade, int actionDistanceLimit, String actionType1, String actionType2) {

        if (distanceMade < 0)  return "Дистанция не может быть отрицательной";
        if (distanceMade == 0) return animalType + " " + name + " стоит на месте";
        if (distanceMade > actionDistanceLimit) return animalType + " " + name + " не может " + actionType2 + " больше, чем "
                + actionDistanceLimit + " м.";

        return animalType + " " + name + " " + actionType1 + " " + distanceMade + " м.";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
