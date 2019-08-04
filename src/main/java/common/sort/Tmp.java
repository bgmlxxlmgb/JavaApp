package common.sort;

/**
 * Created by 10673 on 2019/6/23.
 */
public class Tmp {
    public static void main(String args[]){
        int a=2;
        int b=1;
        b=(a^b);
        a=b^a;
        b=b^a;
        System.out.println(a);
        System.out.println(b);
    }
}
