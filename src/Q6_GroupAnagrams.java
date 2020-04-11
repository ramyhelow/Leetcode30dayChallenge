import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q6_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> anagramMap = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] characterArray = strs[i].toCharArray();
            Arrays.sort(characterArray);
            String mapKey = String.valueOf(characterArray);
            if(anagramMap.containsKey(mapKey)){
                anagramMap.get(mapKey).add(strs[i]);
            }else{
                ArrayList<String> al = new ArrayList();
                al.add(strs[i]);
                anagramMap.put(mapKey, al);
            }
        }
        return new ArrayList(anagramMap.values());
    }
}
