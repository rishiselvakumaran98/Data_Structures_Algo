package Arrays_Hashing.TwoSum.Java;
import java.util.*;

public class TwoSumDuplicates {
    // we have two conditions for this problem:
            // 1. the numbers are not repeated 
            // 2. the numbers are repeated 

    // to solve this we keep a HashMap with key and list to hold the indexes where we visited the number and its index i
    // Then while iterating we are going to search for 
    public static int[] findIndexWithDuplicates(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, List<Integer>> indexMapping = new HashMap<>();
        // 1. Create a index mapping of the numbers in the array with its indexes
        for(int i = 0; i < nums.length; i++){
            int currentNumber = nums[i];
            if(indexMapping.containsKey(currentNumber)){
                indexMapping.get(currentNumber).add(i);
                continue;
            }
            List<Integer> indexes = new ArrayList<>();
            indexes.add(i);
            indexMapping.put(currentNumber, indexes);
        }
        // Now we perform the search over for the remainder/diff
        for(int i = 0; i < nums.length; i++){
            int currentNumber = nums[i];
            int diff = target-currentNumber;

            if(currentNumber == diff){
                // if the associated list has just one index for the number 
                // then we don't have to continue checking for duplicates
                if (indexMapping.get(currentNumber).size() < 2){
                    continue;
                }

                // else we check for the duplicate numbers index and add it as well

                result[0] = i;
                List<Integer> indexes = indexMapping.get(currentNumber);
                final int indexOfI = Collections.binarySearch(indexes, i);
                result[1] = indexes.get((indexOfI+1) % indexes.size());
                break;
            }
            // else we are going to perform normal two sum search
            else{
                if (!indexMapping.containsKey(diff)){
                    continue;
                }
                int index = indexMapping.get(diff).get(0);
                result[0] = i;
                result[1] = index;
                break;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] result = {0,1};
        assert TwoSumDuplicates.findIndexWithDuplicates(nums, 6) == result : "twoSum method failed";
    }
}
