package TimetoBuyandSellStock;

public class Solutions {
    private int[] array ;
    public Solutions(int[] array)
    {
        this.array = array;
    }

    public int findProfit(int[] prices)
    {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i< prices.length; i++)
        {
            if(prices[i] < min)
                min = prices[i];
            else
            {
                max = Math.max(prices[i]-min, max );
            }
        }


            return max;

    }

}
