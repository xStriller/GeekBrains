package ru.xstiller.geekbrains;
import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        //Задание №1
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array1));

        //Задание №2
        int[] array2 = new int[8];
        for (int i = 0, j = 0; i < array2.length; i++, j = j + 3) {
            array2[i] = j;
        }
        System.out.println(Arrays.toString(array2));

        //Задание №3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array3));

        //Задание №4
        int[][] array4 = new int[3][3];
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
        }
        printArray(array4);

        //Задание №5
        int[] array5 = {11, 10, 123, 445, 23, 5435};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array5.length; i++) {
            int current = array5[i];
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }
        System.out.println("min: " + min + "\nmax: " + max);

        //Задание №6
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[]{1, 2, 2, 3, 1, 2}));
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание №6
    public static boolean checkBalance(int[] array) {
        int left = -1;
        int right = array.length;
        int sumLeft = 0;
        int sumRight = 0;
        while (left < right - 1) {
            if (sumLeft > sumRight) {
                right--;
                sumRight += array[right];
            } else {
                left++;
                sumLeft += array[left];
            }
        }
        return sumLeft == sumRight;
    }

    //Задание №7
    public static void rotate(int[] array, int n) {
        n = n % array.length;
        if (n == 0) {
            return;
        }
        int direction = n > 0 ? 1 : -1;
        n = Math.abs(n);
        int currentIdx = 0;
        Integer lastElement = null;
        for (int i = 0; i < array.length; i++) {
            int temp = array[currentIdx];
            if(lastElement != null){
                array[currentIdx] = lastElement;
            }
            lastElement = temp;

            //TODO
        }
    }
}


