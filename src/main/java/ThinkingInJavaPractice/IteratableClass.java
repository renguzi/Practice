package ThinkingInJavaPractice;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author:asher
 * @Date:2021/2/4 15:37
 * @Description:ThinkingInJavaPractice
 * @Version:1.0
 */
public class IteratableClass implements Iterable<String> {
    protected String[] words = ("And that is how we know the Earth to be banana-shaped.".split(" "));
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }
            @Override
            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IteratableClass()) {
            System.out.print(s+" ");
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("hello", "nihao");
        map.put("hello", "nihao1");
        System.out.println(map.size());
        System.out.println(map);
    }


}
