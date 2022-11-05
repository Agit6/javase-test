package thread;

public class Demo01 {}

class Num{
    int i;

    public Num(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {

        Num num = new Num(0);

        new Thread(new JiShu(num),"奇数线程").start();
        Thread t2 = new Thread(new OuShu(num));

        t2.setName("偶数线程");

        t2.start();
    }
}




class JiShu implements Runnable{

    private Num num;

    public JiShu(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            synchronized (num){
                if (num.getI() % 2 != 0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int i = num.getI() + 1;
                num.setI(i);
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                num.notifyAll();
            }
        }

    }
}

class OuShu implements Runnable{

    private Num num;

    public OuShu(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            synchronized (num){
                if (num.getI() % 2 == 0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int i = num.getI() + 1;
                num.setI(i);
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                num.notifyAll();
            }
        }
    }
}