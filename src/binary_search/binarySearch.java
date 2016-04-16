package binary_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gnun on 16.04.2016.
 */
public class binarySearch {

    public static void main(String[] args) {
        int[] array;
        int key;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the array size");
        int size = scanner.nextInt();
        array = new int[size];

        for (int i = 0; i < size; ++i) {
            System.out.println("Input item");
            array[i] = scanner.nextInt();
        }

        System.out.println("Input key");
        key = scanner.nextInt();
        System.out.println("ok!");
        Arrays.sort(array);

        System.out.println("index = " + find(array, key));
    }


    private static int find(int[] array, int key) {
        int index = -1;
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <  high) {
            mid = low + (high - low) / 2;
            if (array[mid] == key) {
                index = mid;
                break;
            } else {

                if (key < array[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return index;
    }

}
