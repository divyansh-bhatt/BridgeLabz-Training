import java.util.Scanner;

public class DistanceConversionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        double y=feet/3;
        double mil= y/1760;

        System.out.println("Distance in yards is "+y+
                " and in miles is "+mil);
    }
}
