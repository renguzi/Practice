package ThinkingInJavaPractice.ContainersInDepth;

import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2021/2/7 11:49
 * @Description:ThinkingInJavaPractice.ContainersInDepth
 * @Version:1.0
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}
