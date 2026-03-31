import java.util.Scanner;

public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U')y++;
            else if(ch=='D')y--;
            else if(ch=='R')x--;
            else if(ch=='L')x++;
        }
        return x==0 && y==0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(judgeCircle(str));
    }
}