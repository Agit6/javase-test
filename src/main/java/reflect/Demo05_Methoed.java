package reflect;

        import java.lang.reflect.Method;

public class Demo05_Methoed {

    public static void main(String[] args) throws Exception{

        Class<?> c = Class.forName("reflect.User");

        Object obj = c.newInstance();

        Method addMethod = c.getDeclaredMethod("add", int.class, int.class);
        Method addMethod1 = c.getDeclaredMethod("add", int.class, int.class, int.class);

        addMethod.setAccessible(true);
        addMethod1.setAccessible(true);

        Object returnValue = addMethod.invoke(obj, 1, 3);
        System.out.println(returnValue);

        Object returnValue1 = addMethod1.invoke(obj, 1, 4, 5);
        System.out.println(returnValue1);
    }
}
