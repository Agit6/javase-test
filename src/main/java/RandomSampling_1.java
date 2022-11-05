public class RandomSampling_1 {

    public static void randomActivity(){
        int index = 0 ;
        double max = 0d;
        int[] arr=new int[]{20,34,160,23,245,180};
        double[] ints = new double[arr.length];

        //时间复杂度为O（n）
        for (int i = 0; i < arr.length; i++) {
            // 积分   *   random(0-1)  *   比值 （比值越小让积分小的人命中概率高一些  比值越高让积分高的人命中概率低一些）
            ints[i]=arr[i] * Math.random() * 0.1D;
            if (i>0) {
                if (max<ints[i]) {
                    index=i;
                    max=ints[i];
                }


            }else {
                max = ints[0];
            }
        }

        System.out.printf("中奖的人是：%d ， 他的积分为 %d  ， 值为 %a%n", index+1, arr[index], max);
    }
}

