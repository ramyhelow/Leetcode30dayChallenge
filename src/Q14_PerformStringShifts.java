public class Q14_PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int n = s.length();
        int rightShiftCount = 0;

        for (int i=0; i<shift.length; i++) {

            if (shift[i][0] == 0) {
                rightShiftCount -= shift[i][1];
            }
            else {
                rightShiftCount += shift[i][1];
            }
        }

        rightShiftCount = rightShiftCount % n;

        char[] shiftedString = new char[n];
        for (int i=0, j=(n-rightShiftCount)%n; i<n; i++) {
            shiftedString[i] = s.charAt(j);
            j = (j+1) % n;
        }

        return String.valueOf(shiftedString);
    }
}
