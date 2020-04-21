import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
        System.out.println("当前时间getTime()返回的值是："+date.getTime());

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是："+zero);
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);
    }
}
