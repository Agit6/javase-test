import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSampling {

    public static void main(String[] args) {

        int[] user = new int[]{20, 34, 25, 45, 67, 160, 234, 345};

//        int[] user = {1, 2, 3, 4};
        List<Integer> jackPool = new ArrayList<>();

        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
            for (int j = 1; j <= user[i]; j++) {
                jackPool.add(i);
            }
        }

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(jackPool.size());
            int userId = jackPool.get(r);
            System.out.println("中奖的用户ID为：" + userId + "，" + "其积分为：" + user[userId]);
        }
    }
}