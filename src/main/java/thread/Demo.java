package thread;

public class Demo {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    Thread currentThread = Thread.currentThread();
                    currentThread.setName("t");
                    System.out.println(currentThread.getName());
                    System.out.println("支栈线程->" + i);
                }
            }
        });

        t.start();
//        t.stop();

        for (int i = 0; i < 1000; i++) {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName());
            System.out.println("主栈线程-->" + i);
        }
    }
}
