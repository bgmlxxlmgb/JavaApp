package common.sort;

/**
 * Created by 10673 on 2019/6/23.
 */
public class QuickSort extends CommonPrint {
    protected int array[];
    public QuickSort(){
        array = super.arr;
    }

    public int partition(int left,int right,int arrayIn[],String mode,QuickSort quickSort){
        int key =arrayIn[left];
        System.out.println("key:"+key+";left:"+left+";right:"+right);
        while(left<right){
            if(mode.equals("asc")){
                while(left<right&&key<arrayIn[right]){
                    right--;
                }

                arrayIn[left]=arrayIn[right];
                while(left<right&&key>arrayIn[left]){
                    left++;
                }
                arrayIn[right]=arrayIn[left];
            }else if (mode.equals("desc")){
                while(left<right&&key>arrayIn[right]){
                    right--;
                }
                arrayIn[left]=arrayIn[right];
                while(left<right&&key<=arrayIn[left]){
                    left++;
                }
                arrayIn[right]=arrayIn[left];
            }else{
                System.out.println("未知的排序模式");
                System.exit(1);
            }
            System.out.print("循环内：");
            quickSort.printArray();
        }
        arrayIn[right]=key;
        System.out.print("循环外：");
        quickSort.printArray();

        System.out.println("index:"+right+"\n");

        return right;
    }

    public void sortArray(int arrayIn[],int left,int right,QuickSort quickSortChild,String mode){
        if(left>right){
            return;
        }
        int index = quickSortChild.partition(left,right,arrayIn,mode,quickSortChild);
        quickSortChild.sortArray(arrayIn,left,index-1,quickSortChild,mode);
        quickSortChild.sortArray(arrayIn,index+1,right,quickSortChild,mode);
    }

    public static void main(String args[]){
        QuickSort qs = new QuickSort();
        System.out.println("排序前的数组：");
        qs.printArray();
        System.out.println("排序后的数组：");
        qs.sortArray(qs.array,0,qs.array.length-1,qs,"asc");
        qs.printArray();
    }
}
