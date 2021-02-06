package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @Author:asher
 * @Date:2021/2/6 11:32
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public void forEachRemaining(Consumer<? super T> action) {

                    }
                };
            }
        };
    }

}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral=new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s:ral ) {
            System.out.print(s+" ");
        }
        System.out.println("\n");
        for (String s: ral.reversed() ) {
            System.out.print(s+" ");
        }
    }
}


