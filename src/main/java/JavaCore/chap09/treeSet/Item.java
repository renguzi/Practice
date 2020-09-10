package JavaCore.chap09.treeSet;

/**
 * @Author:asher
 * @Date:2020/9/6 20:08
 * @Description:JavaCore.chap09.treeSet
 * @Version:1.0
 */
public class Item implements Comparable<Item> {

    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (partNumber != item.partNumber) return false;
        return description != null ? description.equals(item.description) : item.description == null;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + partNumber;
        return result;
    }


    @Override
    public int compareTo(Item o) {
        int diff = this.getPartNumber() - o.getPartNumber();

        return diff != 0 ? diff : this.getDescription().compareTo(o.getDescription());


    }
}
