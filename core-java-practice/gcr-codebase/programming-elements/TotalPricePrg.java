import java.util.Scanner;
public class TotalPricePrg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double uPri= sc.nextDouble();
        int q=sc.nextInt();
        double totPri=uPri*q;
        System.out.println("The total purchase price is INR "+totPri+
                " if the quantity " +q+
                " and unit price is INR " + uPri);
    }
}
