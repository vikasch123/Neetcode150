import java.util.*;



class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Using HashMap to store the value and its index
        Map<Integer, Integer> n = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement

            // Check if the complement exists in the map
            if (n.containsKey(complement)) {
                return new int[] {n.get(complement), i}; // Return indices of the pair
            }
            
            // Add the current number and its index to the map
            n.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum obj=new TwoSum();
        int[] arr={3,4,5,6};
        int[] res=obj.twoSum(arr, 8);
        for(int num:res)
        {
            System.out.println(num);
        }
    }
}
