package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo04_Field {

    public static void main(String[] args) throws Exception{

        Class c = Class.forName("reflect.User");

        Object obj = c.newInstance();

//        Field[] fields = c.getDeclaredFields();

        Field iField = c.getDeclaredField("i");

        iField.set(obj,100);

        System.out.println(iField.get(obj));

        Field sField = c.getDeclaredField("s");

        System.out.println(sField.get(obj));

        // TODO 访问私有属性需要打破封装
        Field bField = c.getDeclaredField("b");

        bField.setAccessible(true);

        bField.set(obj, false);

        System.out.println(bField.get(obj));
//        for(Field field : fields){
//            System.out.println(field.getName());
//        }


    }
}
