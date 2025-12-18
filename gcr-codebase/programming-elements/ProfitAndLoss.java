public class ProfitAndLoss {
    public static void main(String[] args) {

        double cp=129;
        double sp=191;
        double profit=sp-cp;
        double profitPer=(profit/cp)*100;

        System.out.println(
                "The Cost Price is INR " + cp +
                        " and Selling Price is INR " + sp + "\n" +
                        "The Profit is INR " + profit +
                        " and the Profit Percentage is " + profitPer
        );
    }
}

