package arrays;

import java.util.Arrays;

public class Demo01_ArraysUtil {

    public static void main(String[] args) {

        int[] arr = {3, 6, 5, 5, 4, 9, 10, 15, 11, 16, 14, 2, 1};

        Arrays.sort(arr);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        int index = Arrays.binarySearch(arr, 50);

        System.out.println(index < 0);

    }
}
