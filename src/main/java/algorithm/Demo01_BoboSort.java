package algorithm;

public class Demo01_BoboSort {

    public static void main(String[] args) {

        int[] arr = {3,2,7,6,8};
        System.out.println(arr.length);

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
