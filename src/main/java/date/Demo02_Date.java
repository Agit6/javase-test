package date;

public class Demo02_Date {

    public static void main(String[] args) {

        // 自1970年1月1日 00:00:00 000 开始到当前系统的总毫秒数、
        long currentTimestamp = System.currentTimeMillis();
        System.out.println(currentTimestamp);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("花费了" + (end - start) + "毫秒");
    }
}
