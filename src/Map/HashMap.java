package Map;

/**
 * @className:HashMap
 * @description: Map讲解
 * @author: renhai
 * @create: 2021-09-04 10:21
 */

/**
 * key：不可重复 无序（set） key所在的类要重写equals 和hashCode （以hashMap为例）
 * value：可重复 无需序
 * key-vaule 构成 Entry
 * HashMap : Map的主要实现类，线程不安全，效率高，存储null的key和value
 * 子类--linkedHashMap； 按照添加的顺序遍历，添加了双向链表 （频繁的遍历）
 * TreeMap : 排序遍历 key-value 按照key排序 底层红黑树
 * Hashtable : 作为古老的实现类，线程安全，效率低 不能存储null的key和value
 * 子类--Properties：常用来处理配置文件，key value 都是String
 * SortedMap :
 */
public class HashMap {
    public static void main(String[] args) {

    }
}
