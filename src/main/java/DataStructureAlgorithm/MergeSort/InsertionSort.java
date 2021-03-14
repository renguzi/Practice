package DataStructureAlgorithm.MergeSort;

/**
 * @Author:asher
 * @Date:2021/3/11 18:52
 * @Description:DataStructureAlgorithm.MergeSort
 * @Version:1.0
 */
public class InsertionSort{
    //本类是插入排序工具类，没有实例化的需求，所以构造方法私有化
    private InsertionSort(){};
    //带泛型的选择插入排序算法，
    public static <T extends Comparable<T>> void sort(T[] arr){
        //从第i个元素开始循环,直到最后1个元素结束，外循环这里的[i,arr.length)区间的元素都是没排序的。
        for(int i=0;i<arr.length;i++){
            //内循环这里的第[0,j==i)区间的元素是拍好序的
            for(int j=i;j>0;j--){
                //拿出这第i个元素和前面的已排好序的元素逐一比较，如果小于则交换位置
                if(arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }else{
                    //如果不小于即arr[j]>=arr[j-1]，则它一定也不小于更前面的元素，直接跳出内循环
                    break;
                }
            }
        }
    }

    private static <T> void swap(T[] arr,int i,int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){
        Integer[] arr={6,4,2,33,11,5};
        InsertionSort.sort(arr);
        for(Integer k:arr){
            System.out.print(k+"  ");
        }
    }
}
