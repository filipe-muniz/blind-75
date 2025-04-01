
package two_ptrs;

/**
 *
 * @author filipe
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder strB = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                strB.append(Character.toLowerCase(c));
            }
        }
        s = strB.toString();
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
       
    }
}
