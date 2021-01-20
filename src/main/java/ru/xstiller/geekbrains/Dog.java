package ru.xstiller.geekbrains;

public class Dog extends Animal {
    static int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int distance) {
        if(distance > 500){
            throw new IllegalArgumentException(name + " не может пробежать больше 500 м.");
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if(distance > 10){
            throw new IllegalArgumentException(name + " не может проплыть больше 10 м.");
        }
        super.swim(distance);
    }
}
