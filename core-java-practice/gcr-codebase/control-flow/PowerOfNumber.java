import java.util.Scanner;

public class PowerOfNumber {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        if (n>0 && pow>0) {
            int result = 1;

            for(int i=1;i<=pow;i++){
                result = result*n;
            }
            System.out.println(result);
        } 
        System.out.println("Please enter positive integers");
    }
}
