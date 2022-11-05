package number;

import java.math.BigDecimal;

public class Demo02_BigDecimal {

    public static void main(String[] args) {

        // 高精度引用数据类型BigDecimal，一般专用于财务软件中
        BigDecimal bd1 = new BigDecimal(100);
        BigDecimal bd2 = new BigDecimal(200);
        System.out.println(bd2.divide(bd1));
    }
}
