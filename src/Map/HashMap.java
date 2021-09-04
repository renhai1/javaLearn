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


        /**
         * void clear()
         * 从该地图中删除所有的映射（可选操作）。
         *
         * default V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
         * 尝试计算指定键的映射及其当前映射的值（如果没有当前映射， null ）。
         *
         * default V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
         * 如果指定的键尚未与值相关联（或映射到 null ），则尝试使用给定的映射函数计算其值，并将其输入到此映射中，除非 null 。
         *
         * default V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
         * 如果指定的密钥的值存在且非空，则尝试计算给定密钥及其当前映射值的新映射。
         *
         * boolean containsKey(Object key)
         * 如果此映射包含指定键的映射，则返回 true 。
         *
         * boolean containsValue(Object value)
         * 如果此地图将一个或多个键映射到指定的值，则返回 true 。
         *
         * Set<Map.Entry<K,V>> entrySet()
         * 返回此地图中包含的映射的Set视图。
         *
         * boolean equals(Object o)
         * 将指定的对象与此映射进行比较以获得相等性。
         *
         * default void forEach(BiConsumer<? super K,? super V> action)
         * 对此映射中的每个条目执行给定的操作，直到所有条目都被处理或操作引发异常。
         *
         * V get(Object key)
         * 返回到指定键所映射的值，或 null如果此映射包含该键的映射。
         *
         * default V getOrDefault(Object key, V defaultValue)
         * 返回到指定键所映射的值，或 defaultValue如果此映射包含该键的映射。
         *
         * int hashCode()
         * 返回此地图的哈希码值。
         *
         * boolean isEmpty()
         * 如果此地图不包含键值映射，则返回 true 。
         *
         * Set<K> keySet()
         * 返回此地图中包含的键的Set视图。
         *
         * default V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
         * 如果指定的键尚未与值相关联或与null相关联，则将其与给定的非空值相关联。
         *
         * V put(K key, V value)
         * 将指定的值与该映射中的指定键相关联（可选操作）。
         *
         * void putAll(Map<? extends K,? extends V> m)
         * 将指定地图的所有映射复制到此映射（可选操作）。
         *
         * default V putIfAbsent(K key, V value)
         * 如果指定的键尚未与某个值相关联（或映射到 null ）将其与给定值相关联并返回 null ，否则返回当前值。
         *
         * V remove(Object key)
         * 如果存在（从可选的操作），从该地图中删除一个键的映射。
         *
         * default boolean remove(Object key, Object value)
         * 仅当指定的密钥当前映射到指定的值时删除该条目。
         *
         * default V replace(K key, V value)
         * 只有当目标映射到某个值时，才能替换指定键的条目。
         *
         * default boolean replace(K key, V oldValue, V newValue)
         * 仅当当前映射到指定的值时，才能替换指定键的条目。
         *
         * default void replaceAll(BiFunction<? super K,? super V,? extends V> function)
         * 将每个条目的值替换为对该条目调用给定函数的结果，直到所有条目都被处理或该函数抛出异常。
         *
         * int size()
         * 返回此地图中键值映射的数量。
         *
         * Collection<V> values()
         * 返回此地图中包含的值的Collection视图。
         *
         */
    }
}
