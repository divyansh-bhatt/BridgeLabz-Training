import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int mFac=10;
        int[] arr=new int[mFac];
        int ind=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){

                if (ind==mFac) {
                    mFac=mFac* 2;
                    int[] temp=new int[mFac];

                    for (int j = 0; j <arr.length; j++) {
                        temp[j]=arr[j];
                    }

                    arr=temp;
                }
                arr[ind] = i;
                ind++;
            }
        }
        System.out.println("Factors of " + num + " are:");
        for(int i=0;i<ind;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

