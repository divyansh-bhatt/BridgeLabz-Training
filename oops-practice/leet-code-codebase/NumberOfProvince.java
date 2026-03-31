import java.util.*;
public class NumberOfProvince {
    public static void dfs(boolean[]vis,int[][] isConnected,int i){
        vis[i]=true;
        for(int n=0;n<isConnected.length;n++){
            if(isConnected[i][n]==1 && !vis[n]){
                dfs(vis,isConnected,n);
            }
        }
    }
    public static int findCircleNum(int[][] isConnected) {
        int n=isConnected[0].length;
        boolean[]vis=new boolean[n+1];
        int c=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                c++;
                dfs(vis,isConnected,i);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(findCircleNum(arr));
    }
}