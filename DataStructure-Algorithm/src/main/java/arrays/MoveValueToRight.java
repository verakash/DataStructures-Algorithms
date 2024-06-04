package main.java.arrays;

public class MoveValueToRight {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 6, 2, 4, 8, 9 };

        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        moveElement(arr, 2);

        System.out.println();
        System.out.println("Chnaged array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void moveElement(int[] arr, int val) {
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == val) {
                index = j;
                break;
            }
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] != val) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

    }

}
