import java.util.ArrayList;
import java.util.Collections;

public class May232023 {

    public static void main(String[] args) {

    }

    ArrayList<Integer> list;
    int k;
    public void KthLargest(int k, int[] nums) {
        this.k = k;
        this.list = new ArrayList<Integer>();
        for(int num:nums){
            list.add(num);
        }
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list,Collections.reverseOrder());
        //System.out.print
        return list.get(k-1);
    }
}
