import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_to_char {
    public static void main(String[] args) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        System.out.println("未进行格式化时候日期为："+d);
        String str = sdf.format(d);
        System.out.println("24小时制时间为"+str);
        System.out.println("当前时间通过yyyy-MM-dd HH:mm:ss SSS格式化后的输出："+str);



        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d2 =  new Date();
        String str1 = sdf1.format(d2);
        System.out.println("12小时制时间格式为："+str1);
    }
}
