package arrays_hashing;

import java.util.HashMap;


/**
 *
 * @author filipe
 */
public class ValidaAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i = 0; i < s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 1) - 1);
        }
        for(int value: map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
       
    }
    
}
