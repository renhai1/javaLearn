package CommonlClass;

import org.junit.Test;

import java.util.Calendar;

/**
 * @className:commonCalendar
 * @description:
 * @author: renhai
 * @create: 2021-08-31 14:49
 */
public class commonCalendar {
    @Test
    public void test1() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
