package annotation;

import java.math.BigDecimal;
import java.util.Objects;

@MyAnnotation(i=1)
public class Test {

    @MyAnnotation(i=2,value="abc")
    int age;

    String name;

    BigDecimal money;

    public Test() {
        System.out.println("无参构造方法");
    }

    public Test(int age, String name, BigDecimal money) {
        System.out.println("有参构造方法");
    }

    @MyAnnotation(i=3)
    public static void login(int age, String name) {
        if ("张三".equals(name) && age > 18){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return age == test.age &&
                Objects.equals(name, test.name) &&
                Objects.equals(money, test.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, money);
    }
}
