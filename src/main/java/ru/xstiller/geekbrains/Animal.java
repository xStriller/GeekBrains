package ru.xstiller.geekbrains;

public class Animal {
    protected final String name;
    static int countAnimal;


    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м. ");
    }

    public void swim(int distance){
        System.out.println(name + " проплыл " + distance + " м. ");
    }
}
