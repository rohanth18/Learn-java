public class HighestShareProfit 
{
    public static double getHighestProfit(double[] sharePrices)
    {
        if(sharePrices == null || sharePrices.length == 1)
        {
            return 0.0;
        }
        double highestProfit = Double.MIN_VALUE;
        for(int i = 0; i < sharePrices.length - 1; i++)
        {
            for(int j = i + 1; j < sharePrices.length; j++)
            {
                if(sharePrices[j] > sharePrices[i])
                {
                    double currentProfit = sharePrices[j] - sharePrices[i];
                    if(currentProfit > highestProfit)
                    {
                        highestProfit = currentProfit;
                    }
                }
            }
        }
        return highestProfit;
    }

    public static double getHighestProfitV2(double[] sharePrices)
    {
        if(sharePrices == null || sharePrices.length == 1)
        {
            return 0.0;
        }
        double lowestPrice = sharePrices[0];
        double highestProfit = Double.MIN_VALUE;
        for(int sellDay = 0; sellDay < sharePrices.length - 1; sellDay++)
        {
            if(sharePrices[sellDay] > lowestPrice)
            {
                double currentProfit = sharePrices[sellDay] - lowestPrice;
                if(currentProfit > highestProfit)
                {
                    highestProfit = currentProfit;
                }
            }
                if(sharePrices[sellDay] < lowestPrice)
                {
                    lowestPrice = sharePrices[sellDay];
                }
        }
        return highestProfit;
    }
    public static void main(String[] args) 
    {
        double[] sharePrices = {1.2, 1.5, 5.7, 0.5, 1.6};
        //System.out.println("Highest profit = "+getHighestProfit(sharePrices));
        System.out.println("Highest profit = "+getHighestProfitV2(sharePrices));

        
    }
    
}
