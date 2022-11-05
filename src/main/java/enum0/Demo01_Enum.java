package enum0;

/*
    当程序执行后返回的结果大于两种，即可使用枚举类型
 */
public class Demo01_Enum {

    public static void main(String[] args) {

        Season s = Season.Spring;
        switch (s){
            case Spring:
                System.out.println("春天");
                break;
            case Summer:
                System.out.println("夏天");
                break;
            case Autumn:
                System.out.println("秋天");
                break;
            case Winter:
                System.out.println("冬天");
                break;

        }

    }

}

enum Season{
    Spring, Summer, Autumn, Winter
}

