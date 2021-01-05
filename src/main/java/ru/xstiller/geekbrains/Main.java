package ru.xstiller.geekbrains;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    /**
     * 0) Создание поля
     * 1) Проверяем размерность нашего поля
     * 2) Ход первого игрока(ввести координаты, заполнить поле)
     * 3) Проверка победы
     * 4) Проверка заполнено ли поле(ничья)
     * 5) Ход второго игрока(искусственный интелект) если не победил первый(зарандомить координаты, заполнить поле)
     * 6) Проверка победы
     * 7) Проверка заполнено ли поле(ничья)
     * 8) -> 2
     * *****9) Предложить сыграть еще раз
     */
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final int SIZE = 3;
    private static char[][] map;
    private static Scanner scanner = new Scanner(System.in);
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    public static void main(String[] args) {
        //Предложить сыграть ещё раз
        int doRestart;
        do {
            play(scanner);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            doRestart = scanner.nextInt();
            if (doRestart != 1 && doRestart != 0) {
                throw new IllegalArgumentException("Ожидалось 1 или 0");
            }
        } while (doRestart == 1);
        scanner.close();
    }

    private static void play(Scanner scanner) {
        isSizeMoreThanTwo();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (isWin(DOT_0)) {
                System.out.println("Победил ИИ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра окончена");

    }

    //Создание поля
    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //Проверка размерности поля
    private static void isSizeMoreThanTwo() {
        if (SIZE < 3) {
            System.out.println("Минимальный размер поля 3х3");
            System.exit(1);
        }
    }

    //Ход человека
    private static void humanTurn() {
        int x = -1;
        int y = -1;

        do {
            try {
                System.out.println("Введите координаты X и Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Введите числа");
                scanner = new Scanner(System.in);
            }

        } while (!isValid(x, y));

        map[y][x] = DOT_X;

    }

    //Проверяем что x и y входит в заданные границы(размер поля) и в этом месте находится '.'
    private static boolean isValid(int x, int y) {
        return x >= 0 && x < SIZE
                && y >= 0 && y < SIZE
                && map[y][x] == DOT_EMPTY;
    }

    //Проверка победы
    private static boolean isWin(char symbol) {
        for (int x = 0; x < 3; x++) {
            boolean equals = true;
            for (int y = 0; y < 3; y++) {
                if (symbol != map[x][y]) {
                    equals = false;
                    break;
                }
            }
            if (equals) {
                return true;
            }
        }
        for (int y = 0; y < SIZE; y++) {
            boolean equals = true;
            for (int x = 0; x < SIZE; x++) {
                if (symbol != map[x][y]) {
                    equals = false;
                    break;
                }
            }
            if (equals) {
                return true;
            }
        }
        boolean equals = true;
        for (int x = 0, y = 0; x < SIZE && y < SIZE; x++, y++) {
            if (symbol != map[x][y]) {
                equals = false;
                break;
            }
        }
        if (equals) {
            return true;
        }
        equals = true;
        for (int x = SIZE - 1, y = 0; x >= 0 && y < SIZE; x--, y++) {
            if (symbol != map[x][y]) {
                equals = false;
                break;
            }
        }
        return equals;
/*        if(map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol)
            return true;
        if(map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol)
            return true;
        if(map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol)
            return true;
        if(map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol)
            return true;
        if(map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol)
            return true;
        if(map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol)
            return true;
        if(map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol)
            return true;
        if(map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol)
            return true;*/

    }

    //Проверка заполнено ли поле(ничья)
    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    //Ход ИИ
    private static void aiTurn() {
        int x;
        int y;
        System.out.println("Ход AI");
        do {
            x = random.nextInt(0, SIZE);
            y = random.nextInt(0, SIZE);
        } while (!isValid(x, y));

        map[y][x] = DOT_0;
    }

    //Красиво пишем наш массив
    private static void printMap() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}





