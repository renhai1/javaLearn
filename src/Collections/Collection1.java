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
        //List接口：存储有序的，可重复的数据 （动态数组）ArrayList、LinkedList、Vector
        //Set接口：存储无序的、不可重复的数据  （高中集合）  HashSet、LinkedHashSe、TreeSet
        //Map接口：双列集合，用来存储一对（key-value）一对的数据 （函数）HashMap、LinkedHashMap、TreeMap、Hashtable、Properties

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
        System.out.println(collection1.size());
        System.out.println(collection1.isEmpty());
    }
}
