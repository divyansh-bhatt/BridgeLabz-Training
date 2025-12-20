import java.util.Scanner;

public class MeanHeightOfFootballPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr= new double[11];
        double sum=0;

        for(int i=0;i<arr.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
            sum+=arr[i];
        }
        double mean=sum/arr.length;
        System.out.println("Mean height of the football team = " + mean);
    }
}
