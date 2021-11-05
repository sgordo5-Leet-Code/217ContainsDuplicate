import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums){
        HashMap<Integer, Integer> dupes = new HashMap<>();

        for (int num: nums) {
            if (dupes.containsKey(num)) {
                return true;
            } else {
                dupes.put(num, 1);
            }
        }
        return false;
    }
}
