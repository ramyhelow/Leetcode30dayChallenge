public class Q23_BitwiseANDofNumbersRange {

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));
    }

    public static int rangeBitwiseAnd(int m, int n) {
        while(n>m)
            n = n & n-1;
        return m&n;
    }
}
