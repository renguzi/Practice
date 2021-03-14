package ThinkingInJavaPractice.Polymorphism.shape;

/**
 * @Author:asher
 * @Date:2021/3/14 12:09
 * @Description:ThinkingInJavaPractice.Polymorphism.shape
 * @Version:1.0
 */
public class Circle extends Shape{
    public void draw() {
        System.out.println("Circle.draw()");
    }

    public void erase() {
        System.out.println("Circle.erase()");
    }
}
