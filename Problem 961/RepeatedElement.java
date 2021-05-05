
/**
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 *
 * Return the element repeated N times.**/
package NRepeatedElemnt_961;
import java.util.HashMap;

public class RepeatedElement {
    public int repeatedItems (int[] A)
    {
        HashMap<Integer, Integer> dataset = new HashMap<>();
        int count =0;
        for (int num =0; num< A.length; num++)
        {
            if(dataset.containsKey(A[num]))
            {
                return A[num];
            }
            else
            {
                dataset.put(A[num], count++);
            }
        }
        return  -1;
    }

}
