package algorithm;

public class Demo02_SelectSort {

    public static void main(String[] args) {

        int[] arr = {9, 8, 10, 7, 6, 0, 11};

        int compare_num = 0;
        int swap_num = 0;

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                compare_num++;
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                swap_num++;
            }
        }

        System.out.println("比较次数：" + compare_num);
        System.out.println("交换次数：" + swap_num);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
