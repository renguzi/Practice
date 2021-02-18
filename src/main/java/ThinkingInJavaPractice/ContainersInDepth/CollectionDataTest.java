package ThinkingInJavaPractice.ContainersInDepth;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author:asher
 * @Date:2021/2/7 11:57
 * @Description:ThinkingInJavaPractice.ContainersInDepth
 * @Version:1.0
 */
class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds distributing swords in no basis for a system of government".split(" "));
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}
public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(new CollectionData<>(new Government(), 15));
        System.out.println(set);
        System.out.println(set.size());
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
        System.out.println(set.size());
    }
}
