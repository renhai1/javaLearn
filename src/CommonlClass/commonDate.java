package CommonlClass;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className:commonDate
 * @description:
 * @author: renhai
 * @create: 2021-08-31 14:20
 */
public class commonDate {
    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        System.out.println(time);//毫秒，可以用来计算程序运行的时间
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());//毫秒数 从1970年开始
    }

    @Test
    //simpledateformat 作用：1、日期格式化 2、解析
    public void test2() {
        //可以自定义格式new SimpleDateFormat(yyyy-MM-dd hh:mm:ss)
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();

        Date date = new Date();
        //格式化
       String str1= simpleDateFormat1.format(date);
        System.out.println(str1);
        //解析
        String str2="2021/8/31 下午2:43";//解析需要正确的格式
        Date date1= null;
        try {
            date1 = simpleDateFormat1.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);

    }
}
