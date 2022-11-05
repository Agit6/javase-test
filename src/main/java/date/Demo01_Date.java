package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01_Date {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(date));

        // String -> date
        String stringDate = "2022-10-29 15:40:59";
//        SimpleDateFormat sdf1 = new SimpleDateFormat("这里填的格式要和String的相同");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf1.parse(stringDate);
        System.out.println(parse);
    }
}
