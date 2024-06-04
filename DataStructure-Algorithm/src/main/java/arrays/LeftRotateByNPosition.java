package main.java.arrays;

import java.util.Scanner;

/**
 * LeftRotateBy1Position
 */
public class LeftRotateByNPosition {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int pos = 2;
        System.out.println("array before rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("array after rotation by " + pos + " position");

        rotateArray(arr, pos);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void rotateArray(int[] arr, int pos) {
        // before 1, 2, 3, 4, 5, 6, 7
        // after 3, 4, 5, 6, 7, 1, 2

        reverseArray(arr, 0, pos);
        reverseArray(arr, pos + 1, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);

    }

    public static void reverseArray(int[] arr, int start, int end) {
        // before 1, 2, 3, 4, 5, 6, 7
        // after 7, 6, 5, 4, 3, 2, 1

        int i = start;
        int j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}