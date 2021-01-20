package ru.xstiller.geekbrains;

public class Cat extends Animal {
    static int countCat;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void run(int distance) {
        if(distance > 200){
            throw new IllegalArgumentException(name + " не может пробежать больше 200 м.");
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        throw new UnsupportedOperationException(name + " не умеет плавать");
    }
}
