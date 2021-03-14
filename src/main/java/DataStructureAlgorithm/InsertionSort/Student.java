package DataStructureAlgorithm.InsertionSort;

/**
 * @Author:asher
 * @Date:2021/3/11 19:47
 * @Description:DataStructureAlgorithm.InsertionSort
 * @Version:1.0
 */
public class Student implements Comparable<Student>{

    private String name;
    private int height;
    private int age;

    public Student(String name,int height,int age){
        this.name=name;
        this.height=height;
        this.age=age;
    }

    @Override
    public int compareTo(Student stu){
        if(this.height!=stu.height){
            return this.height-stu.height;
        }else{
            return this.age-stu.age;
        }
    }
    @Override
    public String toString(){
        return "Student: name="+name+" height="+height+" age="+age;
    }
}
