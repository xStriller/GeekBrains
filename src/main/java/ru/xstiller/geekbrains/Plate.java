package ru.xstiller.geekbrains;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            return false;
        } else {
            food -= n;
            return true;
        }
    }
    public void increaseFood(int n){
        food += n;
    }

    public void info() {
        System.out.println("В тарелке " + food);
    }
}
