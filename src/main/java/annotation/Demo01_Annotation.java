package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo01_Annotation {

    public static void main(String[] args) throws Exception{

        // TODO 获取类
        Class c = Class.forName("annotation.Test");

        // TODO 获取类的注解
        if (c.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation typeAnnotation = (MyAnnotation) c.getDeclaredAnnotation(MyAnnotation.class);
            int i = typeAnnotation.i();
            String value = typeAnnotation.value();
            System.out.println(i + "\n" + value);
        }

        System.out.println("============================================================");
        // TODO 获取方法上的注解
        Method loginMethod = c.getDeclaredMethod("login", int.class, String.class);

        if (loginMethod.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation methodAnnotation = loginMethod.getDeclaredAnnotation(MyAnnotation.class);
            System.out.println(methodAnnotation.i());
            System.out.println(methodAnnotation.value());
        }

        System.out.println("============================================================");
        //TODO 获取属性上的的注解
        Field age = c.getDeclaredField("age");

        if (age.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation fieldAnnotation = age.getDeclaredAnnotation(MyAnnotation.class);
            System.out.println(fieldAnnotation.i());
            System.out.println(fieldAnnotation.value());
        }
    }
}
