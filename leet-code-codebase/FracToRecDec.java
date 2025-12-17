import java.util.*;
public class FracToRecDec {
    public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)return "0";
        HashMap<Long,Integer>map=new HashMap<>();
        StringBuilder sb = new StringBuilder();
        if((numerator<0)^(denominator<0)){
            sb.append("-");
        }
        long n=Math.abs((long)numerator);
        long d=Math.abs((long)denominator);
        long i=n/d;
        long r=n%d;
        sb.append(i);
        if(r==0)return sb.toString();
        sb.append(".");
        while(r!=0){
            if(map.containsKey(r)) {
                int idx=map.get(r);
                sb.insert(idx, "(");
                sb.append(")");
                break;
            }
            map.put(r,sb.length());
            r=r*10;
            long di=r/d;
            sb.append(di);
            r=r%d;
        }
        return sb.toString();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(fractionToDecimal(n,d));
    }
}
