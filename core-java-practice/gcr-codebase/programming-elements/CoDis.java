

import java.util.Scanner;

public class CoDis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float disInF=sc.nextFloat();
        float disInY=disInF/3;
        float distanceInMiles=disInY/1760;

        System.out.println("The distance in yards is " + disInY + " while the distance in miles is " + distanceInMiles
        );
    }
}
