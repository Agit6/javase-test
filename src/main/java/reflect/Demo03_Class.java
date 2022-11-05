package reflect;

public class Demo03_Class {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> c = Class.forName("reflect.User");
        System.out.println(c);

        //TODO 获取文件的绝对路径
        String path = Thread.currentThread().getContextClassLoader().getResource("reflect/User.class").getPath();
        System.out.println(path);
    }
}
