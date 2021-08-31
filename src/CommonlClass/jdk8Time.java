package CommonlClass;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @className:jdk8Time
 * @description:java8新特性时间类
 * @author: renhai
 * @create: 2021-08-31 15:04
 */
public class jdk8Time {
    @Test
    public void test1()
    {
        System.out.println(LocalTime.now());//h:m:ss
        System.out.println(LocalDate.now());//年月日
        System.out.println(LocalDateTime.now());//年月日+小时分钟秒offsetDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getDayOfMonth());
        //System.out.println(LocalDateTime.of(2020, 9, 30, 15, 23, 56));
        System.out.println(Instant.now());//Instant 程序瞬时值
        Instant instant=Instant.now();
        //设置时区偏移量
       OffsetDateTime offsetDateTime= instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

    }
    @Test
    public void test2()
    {
        //自定义格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
    }
}
