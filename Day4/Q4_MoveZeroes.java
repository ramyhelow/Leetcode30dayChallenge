import java.util.Arrays;
import java.util.HashSet;

public class Q4_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int ptr = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                if(ptr!=i){
                    nums[ptr]=nums[i];
                    nums[i] = 0;
                }
                ptr++;
            }
        }

        for (int num: nums) {
            System.out.print(num+" ");
        }
    }

}
