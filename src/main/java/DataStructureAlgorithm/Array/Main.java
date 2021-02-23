package DataStructureAlgorithm.Array;

/**
 * @Author:asher
 * @Date:2021/2/21 12:57
 * @Description:DataStructureAlgorithm.Array
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);
        array.addFirst(-1);
        System.out.println(array);
        System.out.println(array.find(2));
        array.set(3, 3333);
        System.out.println(array);
        array.remove(3);
        System.out.println(array);
        array.removeFirst();
        System.out.println(array);
        array.removeLast();
        System.out.println(array);
        System.out.println(array.contains(8));
        System.out.println(array.contains(101));
        array.removeElement(8);
        System.out.println(array);

        User u1 = new User("jim", 10);
        User u2 = new User("kate", 11);
        User u3 = new User("meimei", 9);
        Array<User> userArray = new Array<>();
        userArray.addLast(u1);
        userArray.addLast(u2);
        userArray.addLast(u3);
        System.out.println(userArray);

        System.out.println(userArray.contains(new User("meimei", 9)));
        userArray.addLast(u1);
        userArray.addLast(u2);
        userArray.addLast(u3);
        userArray.addLast(u1);
        userArray.addLast(u2);
        userArray.addLast(u3);
        userArray.addLast(u1);
        userArray.addLast(u2);
        System.out.println(userArray.getSize()+"  "+userArray.getCapacity());
        userArray.removeLast();
        System.out.println(userArray.getSize()+"   "+userArray.getCapacity());
        userArray.addLast(u3);
        System.out.println(userArray);

    }
}
