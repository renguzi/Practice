package ThinkingInJavaPractice.ContainersInDepth;

/**
 * @Author:asher
 * @Date:2021/2/7 12:12
 * @Description:ThinkingInJavaPractice.ContainersInDepth
 * @Version:1.0
 */
public class Pair<K,V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        key=k;
        value=v;
    }
}
