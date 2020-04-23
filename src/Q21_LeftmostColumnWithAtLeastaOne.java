import java.util.List;

public class Q21_LeftmostColumnWithAtLeastaOne {
    /**
     * // This is the BinaryMatrix's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface BinaryMatrix {
     *     public int get(int x, int y) {}
     *     public List<Integer> dimensions {}
     * };
     */
     interface BinaryMatrix {
        public int get(int x, int y);
        public List<Integer> dimensions();
     };

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int numRows = binaryMatrix.dimensions().get(0);
        int numColumns = binaryMatrix.dimensions().get(1);

        int leftmostColumn = -1;

        int r = 0;
        int c = numColumns-1;

        if(numRows==0||numColumns==0) return leftmostColumn;

        while(r<numRows && c>=0){
            if(binaryMatrix.get(r,c)==1){
                leftmostColumn = c;
                c--;
            }else{
                r++;
            }
        }

        return leftmostColumn;
    }



    public void binarySearch(BinaryMatrix binaryMatrix, int rowCount){
        int[] list = new int[]{1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = list.length-1;
        int mid;

        while(left<right){
            mid = (left+right)/2;
            if(mid==0) left = mid;
            else if(right-left<=1){
                System.out.println(mid);
                break;
            }else{
                right = mid;
            }
        }
    }
}
