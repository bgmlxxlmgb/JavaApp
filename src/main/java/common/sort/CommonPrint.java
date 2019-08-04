package common.sort;

/**
 * Created by 10673 on 2019/6/23.
 */
public class CommonPrint implements SortTools {
    protected int arr[] = {1,3,5,7,9,8,6,4,2,0};
    public void sortArray(){}
    public void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    };

    public void printArray(int arrIn[]){
        for(int i=0;i<arrIn.length;i++){
            System.out.print(arrIn[i]+" ");
        }
        System.out.println();
    };
}
