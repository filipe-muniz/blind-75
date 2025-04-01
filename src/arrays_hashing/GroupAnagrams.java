
package arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author filipe
 */
public class GroupAnagrams {
    
     public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> answer = new ArrayList<>();
         HashMap<String,Integer> indexMapping = new HashMap<>();
         char[]sortString;
         String currentString;
        
         for(String str: strs){
             sortString = Arrays.copyOf(str.toCharArray(),str.length() );
             Arrays.sort(sortString);
             currentString = new String(sortString);
             
             if(indexMapping.containsKey(currentString)){
                 int index = indexMapping.get(currentString);
                 answer.get(index).add(str);
             }else{
              List<String> newGroup = new ArrayList<>();
              newGroup.add(str);
              answer.add(newGroup);
              indexMapping.put(currentString, answer.size() - 1);
             }
         }
         return answer;
        
    }
    
}
