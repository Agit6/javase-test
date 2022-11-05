package reflect;

public class Demo07_Super {

    public static void main(String[] args) throws Exception{

        Class c = Class.forName("java.lang.String");

        // TODO 获取该类的父类
        Class superclass = c.getSuperclass();
        System.out.println(superclass.getName());

        // TODO 获取该类的接口
        Class[] interfaces = c.getInterfaces();

        for (Class in : interfaces) {
            System.out.println(in.getName());
        }
    }
}
