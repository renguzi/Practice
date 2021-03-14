package ThinkingInJavaPractice.Polymorphism.shape;

/**
 * @Author:asher
 * @Date:2021/3/14 12:10
 * @Description:ThinkingInJavaPractice.Polymorphism.shape
 * @Version:1.0
 */
public class Square extends Shape{
    public void draw() {
        System.out.println("Square.draw()");
    }

    public void erase() {
        System.out.println("Square.erase()");
    }
}
