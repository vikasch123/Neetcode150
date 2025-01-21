import java.util.HashMap;
import java.util.List;
import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        GroupAnagram ob = new GroupAnagram();
        List<List<String>> res = new ArrayList<>();
        String [] str={"act","pots","tops","cat","stop","hat"};
        res=ob.groupAnagrams(str);

        
    }
}