package algorithm;

public class Demo03_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {9, 8, 10, 7, 6, 0, 11};

        int compare_num = 0;
        int swap_num = 0;

        for (int i = arr.length - 1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap_num ++;
                }
                compare_num ++;
            }
        }

        System.out.println("比较次数：" + compare_num);
        System.out.println("交换次数：" + swap_num);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
