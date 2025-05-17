public class Q9_BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {

        int sPointer = S.length()-1;
        int tPointer = T.length()-1;

        while (sPointer >= 0 || tPointer >= 0) {
            sPointer = backspace(S, sPointer);
            tPointer = backspace(T, tPointer);
            if (sPointer < 0 && tPointer < 0) return true;
            if (sPointer< 0 || tPointer < 0 || S.charAt(sPointer) != T.charAt(tPointer)) return false;
            sPointer--; tPointer--;
        }

        return true;
    }

    public int backspace(String str, int index){
        int numBackspaces = 0;
        while (index >= 0 && (numBackspaces > 0 || str.charAt(index) == '#')) {
            if (str.charAt(index) == '#') numBackspaces++;
            else numBackspaces--;
            index--;
        }
        return index;
    }
}
