import java.util.Scanner;

public class TriArea{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double ar=0.5*b*h;
        double area=ar*6.4516;
        System.out.println("The area of the triangle is "
                + ar + " square inches and "
                + area + " square centimeters");
    }
}

