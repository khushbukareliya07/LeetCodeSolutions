import java.math.BigInteger;

public class Solution {
    public int getSum(int a, int b) {
        BigInteger n1 = new BigInteger(String.valueOf(a));
        BigInteger n2 = new BigInteger(String.valueOf(b));
        return  n1.add(n2).intValue();
    }

}
