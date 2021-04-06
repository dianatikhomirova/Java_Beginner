package lesson02;

import java.util.Arrays;

public class Lesson02 {


    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[8];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyBySix(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(searchMin(arr));
        System.out.println(searchMax(arr));
        int[][] arr1 = new int[4][4];
        fillDiagonal(arr1);
        System.out.println(Arrays.deepToString(arr1));
    }

    public static void invertArray(int[] arr) {

        System.out.print("Задание 1: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
    }

    public static void fillArray(int[] arr) {

        System.out.print("Задание 2: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1;
        }

    }

    public static void multiplyBySix(int[] arr) {

        System.out.print("Задание 3: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i];
        }
    }

    public static int searchMin(int[] arr) {

        System.out.print("Задание 4.1: ");

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
        }
        return min;
    }

    public static int searchMax(int[] arr) {

        System.out.print("Задание 4.2: ");

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }

    public static void fillDiagonal(int[][] arr) {

        System.out.print("Задание 5: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == arr.length - j - 1) {
                    arr[i][j] = 1;
                }
            }
        }
    }
}