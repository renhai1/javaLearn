package enumeration;

import org.junit.Test;

/**
 * @className:enumeration1
 * @description: 枚举类讲解 （利用关键字创建枚举类）
 * @author: renhai
 * @create: 2021-08-31 21:50
 */
public enum enumeration1 {
    //jdk5.0之前自定义枚举类
    //jdk5.0之后使用关键字enum
    //类的对象只有有限个，确定的'

    season1("春天", "暖和"),
    season2("夏天", "炎热"),
    season3("秋天", "凉快"),
    season4("冬天", "寒冷");

    private final String seasonName;
    private final String seasonDesc;

    private enumeration1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    @Override
    public String toString() {
        return "enumeration1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

}

