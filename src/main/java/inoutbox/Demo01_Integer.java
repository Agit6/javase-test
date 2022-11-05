package inoutbox;

public class Demo01_Integer {

    public static void main(String[] args) {

        int i = 100;
        // 手动装箱
        Integer integer = new Integer(i);
        // 手动拆箱
        int i1 = integer.intValue();

        // 自动装箱
        Integer a = 127;
        Integer b = 127;
        // 自动拆箱
        int j = a;
        System.out.println(a == b);

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);

        int i2 = Integer.parseInt("123");
        Integer integer1 = Integer.valueOf("234");

        // int -> String
        String s = i + "1";
        System.out.println(s);

        // String -> int
        String s1 = "1123";
        int i3 = Integer.parseInt(s1);
        System.out.println(i3);

        // Integer -> String
        Integer integer2 = 500;
        String s2 = String.valueOf(integer2);
        System.out.println(s2);

        // String -> Integer
        Integer integer3 = Integer.valueOf(s);
        System.out.println(integer3);
    }
}
