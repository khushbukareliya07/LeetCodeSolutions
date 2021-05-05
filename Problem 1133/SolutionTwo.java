/**
 * Given an array of Integer A, returns the largest integer that only occurs once.
 * If no integer occurs once, return -1;
 **/
package LargestUniqueNumber_1133;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SolutionTwo {
    int count= 0;
    public int largestUniqueNumber(int[] A)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int number : A)
        {
            map.put(number, map.getOrDefault(number, 0)+1);
        }
        for(int key : map.keySet())
        {
            //System.out.println("FREQUENCY  of " +key +"is :-> " + map.get(key));
            if(map.get(key) == 1)
            {
                max = Math.max(max, key);
            }
        }

        return max;
    }
}
