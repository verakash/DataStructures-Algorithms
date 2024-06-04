package main.java.arrays;

/**
 * RemoveDuplicatesFromSortedArray
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 5, 5, 6 };

        // actual answer {1,2,3,5,6 . . . .}
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        removeDuplicatesInPlace(arr);
        System.out.println();
        System.out.println("Chnaged array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void removeDuplicatesInPlace(int[] arr) {
        int i = 0;
        for (int j = i; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                continue;
            }
            arr[i + 1] = arr[j];
            i++;
        }
    }
}