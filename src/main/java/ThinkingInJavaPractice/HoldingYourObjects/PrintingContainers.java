package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.*;

/**
 * @Author:asher
 * @Date:2021/2/3 17:21
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));

        HashMap hashMap=new HashMap();
    }
}
