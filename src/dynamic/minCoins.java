package dynamic;
import java.util.*;
public class minCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextInt()){
            int n = Integer.parseInt(sc.nextLine());
            int[] a =  {1,5,7,9,11};

            int [] dp = new int[n+1];
            Arrays.fill(dp,-1);
            dp[0] = 0;

            int ans = minCoins(n,a,dp);
            System.out.println(ans);

            //for(int i:dp) System.out.print(i+" ");
        }

    }

    //function to find minimum number of coins required
    static int minCoins(int n, int[] a, int[] dp){
        if(n==0) return 0;
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            if(n-a[i] >= 0){
                int subAns = 0;
                if(dp[n-a[i]] != -1){
                    subAns = dp[n-a[i]];
                }
                else subAns = minCoins(n-a[i],a,dp);

                if(subAns != Integer.MAX_VALUE && subAns+1<ans){
                    ans = subAns + 1;
                }
            }
        }
        return dp[n]=ans;
    }
}
