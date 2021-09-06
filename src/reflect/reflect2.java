package reflect;

import org.junit.Test;

/**
 * @className:reflect2
 * @description: 获得运行时类的完整结构
 * @author: renhai
 * @create: 2021-09-06 16:01
 */
public class reflect2 {
    @Test
    public void test1() {
        /**
         * Field[] getFields()
         * 返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的属性。
         *
         * Field getDeclaredField(String name)
         * 返回一个 Field对象，它反映此表示的类或接口的属性。
         *
         * 方法 getMethod(String name, 类<?>... parameterTypes)
         * 返回一个 方法对象，它反映此表示的类或接口的指定公共成员方法 类对象。
         *
         * 方法[] getMethods()
         * 返回包含一个数组 方法对象反射由此表示的类或接口的所有公共方法 类对象，包括那些由类或接口和那些从超类和超接口继承的声明。
         *
         * 方法[] getDeclaredMethods()
         * 返回包含一个数组 方法对象反射的类或接口的所有声明的方法，
         * 通过此表示 类对象，包括公共，保护，默认（包）访问和私有方法，但不包括继承的方法。
         *
         * 类<?>[] getInterfaces()
         * 确定由该对象表示的类或接口实现的接口。
         *
         * Annotation[] getAnnotations()
         * 返回此元素上 存在的注释。
         *
         * int getModifiers()
         * 返回此类或接口的Java语言修饰符，以整数编码。
         */

    }
}
