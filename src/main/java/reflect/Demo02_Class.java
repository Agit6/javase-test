package reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo02_Class {

    public static void main(String[] args) throws Exception {

//        String path = Thread.currentThread().getContextClassLoader().getResource("reflect/User.class").getPath();
//        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("");
//        System.out.println(path);

        FileReader fileReader = new FileReader("S:\\IDEA_Project\\javase-test\\src\\main\\resources\\classInfo.properties");
//        FileReader fileReader = new FileReader(path);

        Properties properties = new Properties();

        properties.load(fileReader);

        // 关闭流
        fileReader.close();

        // 从properties中获取value
        String className = properties.getProperty("className");

        // 通过反射机制实例化对象
        Class<?> c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);

    }
}
