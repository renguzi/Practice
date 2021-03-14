package ThinkingInJavaPractice.Polymorphism.shape;

/**
 * @Author:asher
 * @Date:2021/3/14 12:15
 * @Description:ThinkingInJavaPractice.Polymorphism.shape
 * @Version:1.0
 */
public class Shapes {
    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = generator.next();
        }
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}