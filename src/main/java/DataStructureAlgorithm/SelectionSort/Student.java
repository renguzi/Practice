package DataStructureAlgorithm.SelectionSort;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

/**
 * @Author:asher
 * @Date:2021/2/18 16:48
 * @Description:DataStructureAlgorithm.SelectionSort
 * @Version:1.0
 */
public class Student implements Comparable{
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student student=(Student)o;
            if (this.name.compareTo(student.name) == 0) {
                return this.score-student.score;
            }
            return this.name.compareTo(student.name);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
