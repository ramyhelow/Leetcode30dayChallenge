import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q28_FirstUniqueNumber {

    static class FirstUnique {

        Set<Integer> queue;
        Set<Integer> removedNumbers;

        public FirstUnique(int[] nums) {
            queue = new LinkedHashSet<>();
            removedNumbers = new HashSet<>();
            for (int num: nums) {
                add(num);
            }
        }

        public int showFirstUnique() {
            return (queue.size() > 0) ? queue.iterator().next() : -1;
        }

        public void add(int value) {
            if(!removedNumbers.contains(value)){
                if(!queue.contains(value)){
                    queue.add(value);
                }else{
                    queue.remove(value);
                    removedNumbers.add(value);
                }
            }
        }
    }

    public static void main(String[] args) {
        FirstUnique firstUnique = new FirstUnique(new int[]{7,7,7,7,7,7});
        System.out.println(firstUnique.showFirstUnique());
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
        firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
        System.out.println(firstUnique.showFirstUnique());
    }

}
