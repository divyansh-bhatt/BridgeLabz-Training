public class CourseFeeDiscountPrg {
    public static void main(String[] args) {

        double fee=125000;
        double disPer=10;

        double dis=(fee * disPer) / 100;
        double fFee=fee-dis;

        System.out.println("The discount amount is INR " + dis +
                " and final discounted fee is INR " + fFee);
    }
}
