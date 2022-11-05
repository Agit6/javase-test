package number;

import java.text.DecimalFormat;

public class Demo01_Decimal {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(12235.5655);
        System.out.println(s);

        DecimalFormat df1 = new DecimalFormat("###,###.000000");
        String s1 = df1.format(1432512.11);
        System.out.println(s1);
    }
}
