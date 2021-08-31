package enumeration;

/**
 * @className:enumeration
 * @description: 自定义枚举类
 * @author: renhai
 * @create: 2021-08-31 22:18
 */
public class enumeration {

    public static void main(String[] args) {
        enumeration3 enumeration=enumeration3.season1;
        System.out.println(enumeration);
        enumeration1 season2=enumeration1.season2;
        System.out.println(season2);
    }

}

class enumeration3 {
    private final String seasonName;
    private final String seasonDesc;

    public enumeration3(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final enumeration3 season1 = new enumeration3("春天", "暖和");
    public static final enumeration3 season2 = new enumeration3("夏天", "炎热");
    public static final enumeration3 season3 = new enumeration3("秋天", "凉快");
    public static final enumeration3 season4 = new enumeration3("冬天", "寒冷");

    @Override
    public String toString() {
        return "enumeration3{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
