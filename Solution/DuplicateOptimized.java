package Solution;

import java.util.HashSet;
import java.util.Set;

public class DuplicateOptimized {

    // optimized solution using hashset : o(n)

    public static boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        if(n<=1) return false;

        Set<Integer> m=new HashSet<>();
        for(int num:nums){
            if(m.contains(num)) return true;
            m.add(num);
        }
    return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }
}
