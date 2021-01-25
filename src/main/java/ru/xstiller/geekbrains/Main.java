package ru.xstiller.geekbrains;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat("Барсик", 25), new Cat("Пушок", 15), new Cat("Гера", 10)};
        Plate plate = new Plate(60);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
            plate.increaseFood(15);
            plate.info();
        }
    }
}





