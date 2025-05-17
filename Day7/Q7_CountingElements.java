import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Q7_CountingElements {

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{1,3,2,3,5,0}));
    }

    public static int countElements(int[] arr) {
        int res = 0;
        HashSet<Integer> arrayHash = new HashSet();
        for(int num : arr){
            arrayHash.add(num);
        }

        for (int num: arr ) {
            if(arrayHash.contains(num+1)){
                res++;
            }
        }
        return res;
    }
}
