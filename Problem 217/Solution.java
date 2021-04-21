
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s1 = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        if(s1.size() == nums.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
