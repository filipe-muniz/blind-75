package arrays_hashing;

import java.util.HashMap;

/**
 *
 * @author filipe
 */
public class TwoSum {
     public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> valueIndex = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int valueNeeded = target - nums[i];
            if(valueIndex.containsKey(valueNeeded)){
                return new int[]{i,valueIndex.get(valueNeeded)};
            }
            valueIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
