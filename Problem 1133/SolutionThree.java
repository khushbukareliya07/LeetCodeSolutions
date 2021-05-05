package LargestUniqueNumber_1133;

import java.util.TreeMap;

public class SolutionThree {

    public int largestUniqueNumber(int[] A)
    {
        TreeMap<Integer, Integer> map = new TreeMap<>((a,b) -> b-a);
        for(int num : A)
        {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for (int key : map.keySet())
        {
            if(map.get(key) == 1)
                return key;
        }
        return -1;
    }
}
