package ru.xstiller.geekbrains;

public class Main {

    public static void main(String[] args) {
        Cat vasiliy = new Cat("Василий");
        Cat ivan = new Cat("Иван");
        Dog bobik = new Dog("Бобик");
        Dog baron = new Dog("Барон");


        vasiliy.run(175);
        try {
            ivan.run(300);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        baron.run(30);
        bobik.run(500);
        baron.swim(10);
        bobik.swim(5);

        System.out.println(Cat.countCat);
        System.out.println(Dog.countDog);
        System.out.println(Animal.countAnimal);
    }

}





