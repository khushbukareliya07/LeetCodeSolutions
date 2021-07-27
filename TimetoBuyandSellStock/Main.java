package TimetoBuyandSellStock;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {2,4,1};
        Solutions object =  new Solutions(array);
        int profit = object.findProfit(array);

        System.out.println("This is the Profit: "+ profit);
    }
}
