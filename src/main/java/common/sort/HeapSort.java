package common.sort;

/**
 * Created by 10673 on 2019/8/4.
 */
public class HeapSort extends CommonPrint {
    private int array[];
    public HeapSort(){
        this.array = super.arr;
    }

    public void sortArray(int array[],String sortMode){}

    public static void main(String args[]){
        HeapSort hs = new HeapSort();
        System.out.println("排序前的数组：");
        hs.printArray();
        System.out.println("排序后的数组：");
        hs.sortArray(hs.array,"desc");
        hs.printArray();
    }
}
