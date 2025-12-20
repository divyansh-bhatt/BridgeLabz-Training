import java.util.Scanner;

public class ArraySumProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        double tot=0.0;
        int ind=0;
        while (true){
            System.out.print("Enter a number: ");
            double inp=sc.nextDouble();
            if(inp<= 0 || ind==10){
                break;
            }
            arr[ind]=inp;
            ind++;
        }
        for(int i=0;i<ind;i++){
            tot+=arr[i];
        }
        System.out.println("Sum of numbers = " + tot);
    }
}
