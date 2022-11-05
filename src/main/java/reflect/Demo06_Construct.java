package reflect;

import java.lang.reflect.Constructor;

public class Demo06_Construct {

    public static void main(String[] args) throws Exception{

        Class c = Class.forName("reflect.User");

        Object obj = c.newInstance();

        // TODO 获取有参的构造方法
        Constructor con = c.getDeclaredConstructor(int.class);

        con.newInstance(1);

        // TODO 获取无参的构造方法
        Constructor con1 = c.getDeclaredConstructor();

        con1.newInstance();
    }
}
