import java.util.HashMap;
import java.util.HashSet;

public class Q2_HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n){
        HashSet<Integer> hashSet = new HashSet<>();
        int currentNumber = n;
        int result = 0;

        while(currentNumber!=1){
            while(currentNumber!=0){
                result += Math.pow(currentNumber % 10, 2);
                currentNumber /= 10;
            }
            if(hashSet.add(result)!=true) return false;
            currentNumber = result;
            result = 0;
        }
        return true;
    }
}
