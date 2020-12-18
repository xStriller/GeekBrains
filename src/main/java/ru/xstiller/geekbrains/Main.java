package ru.xstiller.geekbrains;

public class Main {

    public static void main(String[] args) {

        byte b = 123;
        short s = 1234;
        int i = 321321;
        long l = 3213123123L;
        float f = 3213.12f;
        double d = 214.321;
        char c = '\u2242';

    }

    public static float f1(float a, float b, float c, float d) {
        return a * (b + (c / d));

    }

    public static boolean b1(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static boolean isNegative(int a) {
        return a < 0;

    }

    public static void printIsNegative(int a){
        if(a < 0) {
            System.out.println("Число " + a + " отрицательное");
        }
        else {System.out.println("Число " + a + " положительное");}
    }

    public static void printName(String name){
        System.out.println("Привет, " + name);
    }

}




