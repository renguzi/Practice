package ThinkingInJavaPractice.ContainersInDepth;


import java.util.Iterator;

/**
 * @Author:asher
 * @Date:2021/2/7 15:26
 * @Description:ThinkingInJavaPractice.ContainersInDepth
 * @Version:1.0
 */
class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number<size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
public class MapDataTest {
    public static void main(String[] args) {
        System.out.println(MapData.map(new Letters(), 11));
//        MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3),8)
//        MapData.
    }
}
