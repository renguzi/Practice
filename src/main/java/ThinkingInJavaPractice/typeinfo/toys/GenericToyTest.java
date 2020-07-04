package ThinkingInJavaPractice.typeinfo.toys;

/**
 * @Author:asher
 * @Date:2020/7/4 15:54
 * @Description:ThinkingInJavaPractice.typeinfo.toys
 * @Version:1.0
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        Class<Toy> up2 = (Class<Toy>) ftClass.getSuperclass();
        Class<Toy> up3 = Toy.class;
        Toy t = (Toy) up.newInstance();
    }
}
