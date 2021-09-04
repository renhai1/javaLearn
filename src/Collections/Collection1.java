package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @className:Collection1
 * @description: 集合的讲解
 * @author: renhai
 * @create: 2021-09-01 9:37
 */
public class Collection1 {
    public static void main(String[] args) {
        //Collection接口：单列集合，用来存储一个一个的对象
        /**
         * List接口：存储有序的，可重复的数据 （动态数组）
         *       ArrayList(主要实现类 线程不安全，速度快，底层存储Object[] 扩容1.5倍) 建议使用带参的构造器，避免扩容
         *       ArrayList jdk1.7和jdk1.8 底层代码略有不同（开始时不一样） 1.8的比1.7的更节省内存
         *       LinkedList(对于频繁的插入、删除操作，使用此类效率比ArrayList高；底层使用双向链表存储 扩容1.5倍)、
         *       Vector(线程安全，速度慢，底层存储Object[] 扩容2倍)
         */

        /**
         * Set接口：存储无序的、不可重复的数据（本质equals判断）  （高中集合）
         *  HashSet 线程不安全 可以存储null值
         *  （源码：向hashset添加元素先调用hashcode方法得到hash值，
         *  然后得到在底层数组存放位置，若此位置没元素，添加，有元素比较两个hash值是否相等，不相等以链表的形式添加，
         * 相等调用equals方法，true不添加，false添加）
         *  LinkedHashSe 作为hashset的子类  使得遍历内部数据时，按照添加的顺序遍历，遍历速率快 添加数据的同时，添加了双向链表，记录添加顺序
         *  TreeSet 二叉树存储 放入的数据需要是同一个类new的
         */

        /**
         * Map接口：双列集合，用来存储一对（key-value）一对的数据 （函数）
         * HashMap、LinkedHashMap、TreeMap、Hashtable、Properties
         */

        /** Collection方法
         * boolean add(E e)
         * 确保此集合包含指定的元素（可选操作）。
         *
         * boolean addAll(Collection<? extends E> c)
         * 将指定集合中的所有元素添加到此集合（可选操作）。
         *
         * void clear()
         * 从此集合中删除所有元素（可选操作）。
         *
         * boolean contains(Object o)
         * 如果此集合包含指定的元素，则返回 true 。
         *
         * boolean containsAll(Collection<?> c)
         * 如果此集合包含指定 集合中的所有元素，则返回true。
         *
         * boolean equals(Object o)
         * 将指定的对象与此集合进行比较以获得相等性。
         *
         * int hashCode()
         * 返回此集合的哈希码值。
         *
         * boolean isEmpty()
         * 如果此集合不包含元素，则返回 true 。
         *
         * Iterator<E> iterator()
         * 返回此集合中的元素的迭代器。
         *
         * default Stream<E> parallelStream()
         * 返回可能并行的 Stream与此集合作为其来源。
         *
         * boolean remove(Object o)
         * 从该集合中删除指定元素的单个实例（如果存在）（可选操作）。
         *
         * boolean removeAll(Collection<?> c)
         * 删除指定集合中包含的所有此集合的元素（可选操作）。
         *
         * default boolean removeIf(Predicate<? super E> filter)
         * 删除满足给定谓词的此集合的所有元素。
         *
         * boolean retainAll(Collection<?> c)
         * 仅保留此集合中包含在指定集合中的元素（可选操作）。
         *
         * int size()
         * 返回此集合中的元素数。
         *
         * default Spliterator<E> spliterator()
         * 创建一个Spliterator在这个集合中的元素。
         *
         * default Stream<E> stream()
         * 返回以此集合作为源的顺序 Stream 。
         *
         * Object[] toArray()
         * 返回一个包含此集合中所有元素的数组。
         *
         * <T> T[] toArray(T[] a)
         * 返回包含此集合中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型。
         *
         */
        Collection collection1 = new ArrayList();
        //添加
        collection1.add("renhai");
        collection1.add("kenan");
        collection1.add("sherry");
        collection1.add(123);
//        System.out.println(collection1.size());
//        System.out.println(collection1.isEmpty());
        for (Object oj : collection1) {
            System.out.println(oj);

        }
    }
}
