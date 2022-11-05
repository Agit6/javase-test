package reflect;

/**
 * 获取Class后能干什么？
 * 1、通过Class的newInstance()方法来实例化对象
 * 注意：newInstance()方法内部实际上调用了该类的无参构造方法，必须保证类中有无参构造才可以成功执行
 */
public class Demo01_Class {

    public static void main(String[] args) {

        Class<User> userClass = User.class;
        try {
            User user = userClass.newInstance();
            System.out.println(user);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

