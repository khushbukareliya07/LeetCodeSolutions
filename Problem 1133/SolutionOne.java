/**
 * Given an array of Integer A, returns the largest integer that only occurs once.
 * If no integer occurs once, return -1;
 **/

package LargestUniqueNumber_1133;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SolutionOne {
    int count= 0;
    public int largestUniqueNumber(int[] A)
    {
        HashMap<Integer, Integer> dataset = new HashMap<Integer, Integer>();
        for(int i = 0; i< A.length; i++)
        {
            if(!dataset.containsKey(A[i]))
            {
                dataset.put(A[i], count);
            }
            else
                dataset.computeIfPresent(A[i], (k,v) -> v+1);
        }
        int max =0;
        Iterator i = dataset.entrySet().iterator();
        while (i.hasNext())
        {
            Map.Entry element = (Map.Entry)i.next();
            if((element.getValue().equals((int)0)))
            {
                max = Math.max(max, (int) element.getKey());
            }
        }

        return max;

    }
}
