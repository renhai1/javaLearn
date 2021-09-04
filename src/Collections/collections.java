package Collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @className: Collections
 * @description: collections工具类
 * @author: renhai
 * @create: 2021-09-04 19:52
 */
public class collections {

    /**
     * Method and Description
     * static <T> boolean addAll(Collection<? super T> c, T... elements)
     * 将所有指定的元素添加到指定的集合。
     * <p>
     * static <T> Queue<T> asLifoQueue(Deque<T> deque)
     * 返回Deque作为先进先出（ Lifo ） Queue的视图 。
     * <p>
     * static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
     * 使用二叉搜索算法搜索指定对象的指定列表。
     * <p>
     * static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
     * 使用二叉搜索算法搜索指定对象的指定列表。
     * <p>
     * static <E> Collection<E> checkedCollection(Collection<E> c, 类<E> type)
     * 返回指定集合的动态类型安全视图。
     * <p>
     * static <E> List<E> checkedList(List<E> list, 类<E> type)
     * 返回指定列表的动态类型安全视图。
     * <p>
     * static <K,V> Map<K,V> checkedMap(Map<K,V> m, 类<K> keyType, 类<V> valueType)
     * 返回指定地图的动态类型安全视图。
     * <p>
     * static <K,V> NavigableMap<K,V> checkedNavigableMap(NavigableMap<K,V> m, 类<K> keyType, 类<V> valueType)
     * 返回指定可导航地图的动态类型安全视图。
     * <p>
     * static <E> NavigableSet<E> checkedNavigableSet(NavigableSet<E> s, 类<E> type)
     * 返回指定的可导航集的动态类型安全视图。
     * <p>
     * static <E> Queue<E> checkedQueue(Queue<E> queue, 类<E> type)
     * 返回指定队列的动态类型安全视图。
     * <p>
     * static <E> Set<E> checkedSet(Set<E> s, 类<E> type)
     * 返回指定集合的动态类型安全视图。
     * <p>
     * static <K,V> SortedMap<K,V> checkedSortedMap(SortedMap<K,V> m, 类<K> keyType, 类<V> valueType)
     * 返回指定排序映射的动态类型安全视图。
     * <p>
     * static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, 类<E> type)
     * 返回指定排序集的动态类型安全视图。
     * <p>
     * static <T> void copy(List<? super T> dest, List<? extends T> src)
     * 将所有元素从一个列表复制到另一个列表中。
     * <p>
     * static boolean disjoint(Collection<?> c1, Collection<?> c2)
     * 如果两个指定的集合没有共同的元素，则返回 true 。
     * <p>
     * static <T> Enumeration<T> emptyEnumeration()
     * 返回没有元素的枚举。
     * <p>
     * static <T> Iterator<T> emptyIterator()
     * 返回没有元素的迭代器。
     * <p>
     * static <T> List<T> emptyList()
     * 返回空列表（immutable）。
     * <p>
     * static <T> ListIterator<T> emptyListIterator()
     * 返回没有元素的列表迭代器。
     * <p>
     * static <K,V> Map<K,V> emptyMap()
     * 返回空的地图（不可变）。
     * <p>
     * static <K,V> NavigableMap<K,V> emptyNavigableMap()
     * 返回空导航地图（不可变）。
     * <p>
     * static <E> NavigableSet<E> emptyNavigableSet()
     * 返回一个空导航集（immutable）。
     * <p>
     * static <T> Set<T> emptySet()
     * 返回一个空集（immutable）。
     * <p>
     * static <K,V> SortedMap<K,V> emptySortedMap()
     * 返回空的排序映射（immutable）。
     * <p>
     * static <E> SortedSet<E> emptySortedSet()
     * 返回一个空的排序集（immutable）
     * <p>
     * static <T> Enumeration<T> enumeration(Collection<T> c)
     * 返回指定集合的枚举。
     * <p>
     * static <T> void fill(List<? super T> list, T obj)
     * 用指定的元素代替指定列表的所有元素。
     * <p>
     * static int frequency(Collection<?> c, Object o)
     * 返回指定集合中与指定对象相等的元素数。
     * static int indexOfSubList(List<?> source, List<?> target)
     * 返回指定源列表中指定目标列表的第一次出现的起始位置，如果没有此类事件，则返回-1。
     * static int lastIndexOfSubList(List<?> source, List<?> target)
     * 返回指定源列表中指定目标列表的最后一次出现的起始位置，如果没有此类事件则返回-1。
     * static <T> ArrayList<T> list(Enumeration<T> e)
     * 返回一个数组列表，其中包含由枚举返回的顺序由指定的枚举返回的元素。
     * static <T extends Object & Comparable<? super T>>
     * T max(Collection<? extends T> coll)
     * 根据其元素的 自然顺序返回给定集合的最大元素。
     * static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)
     * 根据指定的比较器引发的顺序返回给定集合的最大元素。
     * static <T extends Object & Comparable<? super T>>
     * T min(Collection<? extends T> coll)
     * 根据其元素的 自然顺序返回给定集合的最小元素。
     * static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp)
     * 根据指定的比较器引发的顺序返回给定集合的最小元素。
     * static <T> List<T> nCopies(int n, T o)
     * 返回由指定对象的 n副本组成的不可变列表。
     * static <E> Set<E> newSetFromMap(Map<E,Boolean> map)
     * 返回由指定地图支持的集合。
     * static <T> boolean replaceAll(List<T> list, T oldVal, T newVal)
     * 将列表中一个指定值的所有出现替换为另一个。
     * static void reverse(List<?> list)
     * 反转指定列表中元素的顺序。
     * static <T> Comparator<T> reverseOrder()
     * 返回一个比较器，它对实现 Comparable接口的对象集合施加了 自然排序的相反。
     * static <T> Comparator<T> reverseOrder(Comparator<T> cmp)
     * 返回一个比较器，它强制指定比较器的反向排序。
     * static void rotate(List<?> list, int distance)
     * 将指定列表中的元素旋转指定的距离。
     * static void shuffle(List<?> list)
     * 使用默认的随机源随机排列指定的列表。
     * static void shuffle(List<?> list, Random rnd)
     * 使用指定的随机源随机排列指定的列表。
     * static <T> Set<T> singleton(T o)
     * 返回一个只包含指定对象的不可变集。
     * static <T> List<T> singletonList(T o)
     * 返回一个只包含指定对象的不可变列表。
     * static <K,V> Map<K,V> singletonMap(K key, V value)
     * 返回一个不可变的地图，只将指定的键映射到指定的值。
     * static <T extends Comparable<? super T>>
     * void sort(List<T> list)
     * 根据其元素的natural ordering对指定的列表进行排序。
     * static <T> void sort(List<T> list, Comparator<? super T> c)
     * 根据指定的比较器引起的顺序对指定的列表进行排序。
     * static void swap(List<?> list, int i, int j)
     * 交换指定列表中指定位置的元素。
     * static <T> Collection<T> synchronizedCollection(Collection<T> c)
     * 返回由指定集合支持的同步（线程安全）集合。
     * static <T> List<T> synchronizedList(List<T> list)
     * 返回由指定列表支持的同步（线程安全）列表。
     * static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)
     * 返回由指定地图支持的同步（线程安全）映射。
     * static <K,V> NavigableMap<K,V> synchronizedNavigableMap(NavigableMap<K,V> m)
     * 返回由指定的可导航地图支持的同步（线程安全）可导航地图。
     * static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s)
     * 返回由指定的可导航集支持的同步（线程安全）可导航集。
     * static <T> Set<T> synchronizedSet(Set<T> s)
     * 返回由指定集合支持的同步（线程安全）集。
     * static <K,V> SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m)
     * 返回由指定的排序映射支持的同步（线程安全）排序映射。
     * static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s)
     * 返回由指定的排序集支持的同步（线程安全）排序集。
     * static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c)
     * 返回指定集合的不可修改视图。
     * static <T> List<T> unmodifiableList(List<? extends T> list)
     * 返回指定列表的不可修改视图。
     * static <K,V> Map<K,V> unmodifiableMap(Map<? extends K,? extends V> m)
     * 返回指定地图的不可修改视图。
     * static <K,V> NavigableMap<K,V> unmodifiableNavigableMap(NavigableMap<K,? extends V> m)
     * 返回指定可导航地图的不可修改视图。
     * static <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s)
     * 返回指定的可导航集合的不可修改的视图。
     * static <T> Set<T> unmodifiableSet(Set<? extends T> s)
     * 返回指定集合的不可修改视图。
     * static <K,V> SortedMap<K,V> unmodifiableSortedMap(SortedMap<K,? extends V> m)
     * 返回指定排序映射的不可修改视图。
     * static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> s)
     * 返回指定排序集的不可修改视图。
     */
    @Test
    public void test1() {
        List list1 = new ArrayList();
        list1.add(1111);
        list1.add(3);
        Collections.reverse(list1);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(Collections.max(list1));
    }
}
