package DataStructureAlgorithm.LinearSearch;

/**
 * @Author:asher
 * @Date:2021/2/16 10:56
 * @Description:DataStructureAlgorithm.LinearSearch
 * @Version:1.0
 */
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

}
