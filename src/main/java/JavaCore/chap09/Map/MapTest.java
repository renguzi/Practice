package JavaCore.chap09.Map;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @Author:asher
 * @Date:2020/9/11 09:46
 * @Description:JavaCore.chap09.Map
 * @Version:1.0
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap staff = new HashMap<String, Employee>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));
        //print all entries
        System.out.println(staff);

        //remove an entry
        staff.remove("567-24-2546");

        //replace an entry
        staff.put("456-62-5527", new Employee("Francesca Milla"));

        //look up a value
        System.out.println("-------------");
        System.out.println(staff.get("157-62-7935"));

        //iterate through all entries
        System.out.println("=======================");
        staff.forEach((k,v)-> System.out.println("key="+k+", value="+v)  );


        //通过Map的values()方法获取的collection的remove()方法，来删除值，进而将Map的key-value键值对删除
        staff.values().remove("Gary Cooper");
        System.out.println("After remove......");
        staff.forEach((k,v)-> System.out.println("key="+k+", value="+v)  );


        TreeMap treeMap = new TreeMap<String, String>();
        treeMap.put("a", "hello");
        treeMap.put("c", "zzz");
        System.out.println(treeMap);
        System.out.println(treeMap.getOrDefault("b", "hello"));
        System.out.println(treeMap.get("b"));

        treeMap.values().remove("zzz");
        System.out.println(treeMap);
    }
}
