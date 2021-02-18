package ThinkingInJavaPractice.TreeSetAndTreeMap;

import org.junit.jupiter.api.Test;

import javax.jws.soap.SOAPBinding;
import java.util.Comparator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author:asher
 * @Date:2021/2/7 17:49
 * @Description:ThinkingInJavaPractice.TreeSetAndTreeMap
 * @Version:1.0
 */
public class TreeSetTest {
    @Test
    public void test1() {
        Set<User> set = new java.util.TreeSet<>();
        User u1 = new User("tom", 5);
        User u2 = new User("Allen", 10);
        User u3 = new User("Chirs", 8);
        set.add(u1);
        set.add(u2);
        set.add(u3);
        System.out.println(set);
    }

    class MyComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            if (o1 instanceof User && o2 instanceof User) {
                return o2.getAge() - o1.getAge();
            } else {
                throw new RuntimeException("不合法");
            }
        }
    }

    @Test
    public void test2() {
        Set<User> set=new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        User u1 = new User("tom", 5);
        User u2 = new User("Allen", 10);
        User u3 = new User("Chirs", 8);

        set.add(u3);
        set.add(u2);
        set.add(u1);
        System.out.println(set);
    }

    @Test
    public void tes3() {
        Set<User> set = new TreeSet<>(new MyComparator());
        User u1 = new User("tom", 5);
        User u2 = new User("Allen", 10);
        User u3 = new User("Chirs", 8);
        set.add(u3);
        set.add(u1);
        set.add(u2);
        System.out.println(set);
    }
}
