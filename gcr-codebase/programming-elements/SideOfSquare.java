import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float per= sc.nextFloat();
        float side=per/ 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + per);
    }
}
