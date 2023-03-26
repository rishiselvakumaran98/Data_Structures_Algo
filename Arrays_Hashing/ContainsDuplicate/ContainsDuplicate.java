package Arrays_Hashing.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // have a set to keep track of all the numbers visited in the array
        Set<Integer> visited = new HashSet<>();
        for(int i: nums){
            if (visited.contains(i)){
                return true;
            }
            visited.add(i);
        }
        return false;
    }
}
