package ru.xstiller.geekbrains;

public class Cat {
    private boolean satiety = false;
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    public void info() {
        String s = satiety ? "" : " не";
        System.out.println("Кот " + name + s + " сыт");
    }
}
