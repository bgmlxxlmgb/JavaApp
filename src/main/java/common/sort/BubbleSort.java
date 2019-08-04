package common.sort;

/**
 * Created by 10673 on 2019/6/23.
 */
public class BubbleSort extends CommonPrint {
    protected int array[];
    public BubbleSort(){
        array = super.arr;
    }

    public void sortArray(int [] arrayIn,String mode){
        int swapNum = 0;
        for (int i=0;i<arrayIn.length;i++){
            for (int j=0;j<arrayIn.length-1;j++){
                int isSwap = 0;
                if(mode.equals("asc")){
                    if(arrayIn[j]>arrayIn[j+1]){
                        isSwap=1;
                    }
                }else if(mode.equals("desc")){
                    if(arrayIn[j]<arrayIn[j+1]){
                        isSwap=1;
                    }
                }else{
                    System.out.println("未知的排序模式");
                    System.exit(1);
                }
                if(isSwap==1){
                    /*swapNum=arrayIn[j];
                    arrayIn[j]=arrayIn[j+1];
                    arrayIn[j+1]=swapNum;*/
                    arrayIn[j]=arrayIn[j]^arrayIn[j+1];
                    arrayIn[j+1]=arrayIn[j+1]^arrayIn[j];
                    arrayIn[j]=arrayIn[j]^arrayIn[j+1];
                }
            }
        }
    }

    public static void main(String args[]){
        BubbleSort bs = new BubbleSort();
        System.out.println("排序前的数组：");
        bs.printArray();
        System.out.println("排序后的数组：");
        bs.sortArray(bs.array,"desc");
        bs.printArray();
    }
}
