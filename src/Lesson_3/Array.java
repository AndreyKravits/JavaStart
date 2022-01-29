package Lesson_3;

import java.util.Arrays;

class HomeWorkApp3 {
    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            array[i] = (array[i] == 1) ? 1 : 0;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("     ");

//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] array1 = new int[100];
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("    ");
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {

            if (array3[i] < 6)
                array3[i] *= 2;
        }
        System.out.println(Arrays.toString(array3));
        System.out.println("     ");

        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] array4 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            array4[i][i] = 1;
            array4[i][10 - i - 1] = 1;
        }
        for (int i = 0; i < 10; i++)
            System.out.println(Arrays.toString(array4[i]));
        System.out.println("---------");
        // 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

        int len=20;
        int initialValue= 44;
        int []array5 = inArray(len,initialValue);
        System.out.println(Arrays.toString(array5));
    }
    public static int[] inArray (int len,int intialValue) {
        int[] array5 = new int[len];
        Arrays.fill(array5, intialValue);
        return array5;
    }
}