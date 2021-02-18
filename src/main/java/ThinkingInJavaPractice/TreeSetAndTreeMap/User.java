package ThinkingInJavaPractice.TreeSetAndTreeMap;

/**
 * @Author:asher
 * @Date:2021/2/7 17:49
 * @Description:ThinkingInJavaPractice.TreeSetAndTreeMap
 * @Version:1.0
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User u = (User) o;
            return this.name.compareToIgnoreCase(((User) o).name);
        } else {
            throw new RuntimeException("输入的数据不合法");
        }
    }
}
