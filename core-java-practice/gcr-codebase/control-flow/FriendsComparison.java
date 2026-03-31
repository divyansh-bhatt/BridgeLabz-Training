import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's height: ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        int youngest = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (youngest == amarAge)
            System.out.println("Amar is the youngest");
        else if (youngest == akbarAge)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        int tallest = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (tallest == amarHeight)
            System.out.println("Amar is the tallest");
        else if (tallest == akbarHeight)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}
