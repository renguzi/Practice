package DataStructureAlgorithm.Array;

/**
 * @Author:asher
 * @Date:2021/2/21 11:33
 * @Description:DataStructureAlgorithm.Array
 * @Version:1.0
 */
public class Array<E> {
    private E[] data;
    //size记录数组中现有的元素个数，初始化为0
    private int size;

    //初始化一个大小为capacity的数组
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        this.size=0;
    }

    //默认情况下，初始化一个大小为10的数组
    public Array() {
        this(10);
    }

    //查看数组中有几个元素
    public int getSize() {
        return size;
    }

    //查看数组容量
    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
//元素最后位置处添加新元素
    public void addLast(E n) {
        /*
        if (size > data.length) {
            throw new IllegalStateException("addLast failed.  size>capacity");
        }
        data[size] = n;
        size++;
         */
        add(size, n);
    }

    //指定位置添加新元素
    public void add(int index, E n) {
        if (size == data.length) {
//            throw new IllegalStateException("add failed. Array is full.");
            //如果数组满了，此时不再报错了，而是对数组进行扩容，扩容为原来长度的2倍。
            System.out.println("开始扩容为2倍的长度");
            resize(2*data.length);
        }

        if (index < 0 || index > size) {
            throw new IllegalStateException("add failed.  index<0||index>data.length");
        }
        for (int i = size; i - 1 > index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = n;
        size++;
    }

//第1个位置处添加新元素
    public void addFirst(E n) {
        add(0, n);
    }

    private void resize(int newSize) {
        E[] newData = (E[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    //查找元素e是否在数组中，如果在就返回其索引位置，不存在则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //查找第index个位置出的元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalStateException("get failed. 索引位置index不合法");
        }
        return data[index];
    }

    //修改第index个位置处的元素
    public void set(int index,E e){
        if (index < 0 || index >= size) {
            throw new IllegalStateException("set failed. 要修改的位置不合法");
        }
        data[index] = e;
    }

    //判断数组中是否包含元素e?
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //从数组中删除指定index位置处的元素，并返回该元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalStateException("remove failed. 要删除的index位置不合法");
        }
        E temp = data[index];
        for (int i = index; i +1<size ; i++) {
            data[i] = data[i + 1];
        }
        size--;
        if (size == data.length/2 && data.length/2 !=0) {
            resize(data.length/2);
        }
        return temp;
    }

    //删除第1个位置处元素
    public E removeFirst() {
        return remove(0);
    }
    //删除最后1个位置处元素
    public E removeLast(){
        return remove(size-1);
    }

    //删除指定的元素
    public void removeElement(E e) {
        if (contains(e)) {
            int i = find(e);
            remove(i);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array size: %d ,Capacity: %d \n",size,data.length));
        stringBuilder.append("{");
        //需要注意的是，这里的遍历，只能到size位置处，而不能写capacity，因为从size位置开始，后面的有可能是空的
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
