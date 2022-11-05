package algorithm;

import java.util.Arrays;

public class Demo05_BinarySearch {

    public static void main(String[] args) {

        int[] arr = {9, 8, 5, 10, 7, 6, 5, 0, 11, 12, 6};

        int index = BinarySearch(arr, 5);

        System.out.println("yes i can't");

        System.out.println("yes i can");

        System.out.println("i konw i can");

        System.out.println("finally end");

        System.out.println("good night");

        System.out.println((index == -1)?"该数不存在":"该数的下标为：" + index);

    }

    public static int BinarySearch(int[] arr, int num) {

        int begin = 0;

        int end = arr.length - 1;

        Arrays.sort(arr);

        while (begin <= end){
            int mid = (begin + end) / 2;

            if (arr[mid] == num){
                return  mid;
            }else if (arr[mid] < num){
                begin = mid + 1;
            }else if (arr[mid] > num) {
                end = mid - 1;
            }
        }

        return  -1;
    }
}
