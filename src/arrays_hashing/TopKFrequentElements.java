package arrays_hashing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author filipe
 */
public class TopKFrequentElements {
    
       public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort(Comparator.comparingInt(a -> a[0]));

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr.remove(arr.size() -1)[1];
        }
    
        return res;
       }
}
