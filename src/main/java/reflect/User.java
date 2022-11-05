package reflect;

public class User{

    int i;

    int j;

    String s;

    private boolean b;

    static {
        System.out.println("静态代码块执行了");
    }

    public User() {
        System.out.println("无参构造方法执行");
    }

    public User(int i) {
        System.out.println("有参构造方法执行");
    }

    private int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}
