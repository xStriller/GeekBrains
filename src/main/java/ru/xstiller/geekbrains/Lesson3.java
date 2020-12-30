package ru.xstiller.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doRestart;
        do {
            play(scanner);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            doRestart = scanner.nextInt();
            if (doRestart != 1 && doRestart != 0){
                throw new IllegalArgumentException("Ожидалось 1 или 0");
            }
        } while (doRestart == 1);
        scanner.close();
    }
    private static void play(Scanner scanner) {
        System.out.println("Ваша задача угадать число от 0 до 9, но помни, что у тебя только 3 попытки.\nУдачи!");
        Random random = new Random();
        int guessNumber = random.nextInt(10);
        for (int i = 3; i > 0; i--) {
            System.out.println("Введите число от 0 до 9.\nОсталось попыток: " + i);
            int number = scanner.nextInt();
            if (number == guessNumber) {
                System.out.println("Вы выиграли!");
                break;
            } else if (number < guessNumber) {
                System.out.println("Загаданное число больше чем " + number);
            } else {
                System.out.println("Загаданное число меньше чем " + number);
            }
        }
    }
}


