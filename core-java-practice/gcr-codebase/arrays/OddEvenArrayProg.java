import java.util.Scanner;

public class OddEvenArrayProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num<= 0){
            System.out.println("Invalid input. Enter a natural number.");
            return;
        }
        int[] even=new int[num/2+1];
        int[] odd=new int[num/2+1];

        int eInd=0,oInd=0;

        for(int i=1;i<=num;i++){
            if (i % 2 == 0)
                even[eInd++]=i;
            else
                odd[oInd++] = i;
        }

        System.out.println("Odd Numbers:");
        for(int i=0;i<oInd;i++)
            System.out.print(odd[i] + " ");

        System.out.println("\nEven Numbers:");
        for(int i=0;i<eInd;i++)
            System.out.print(even[i] + " ");
    }
}

