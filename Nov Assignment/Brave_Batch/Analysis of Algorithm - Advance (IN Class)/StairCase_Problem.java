import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static long climbStairs(int n){
		long[] dp=new long[n+1];
		long mod=1000000007;
		if(n==0){
			return 1;
		}
		else if(n<0){
			return 0;
		}
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		if(dp[n]>0){
			return dp[n];
		}

		for(int i=3;i<=n;i++){
			dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%mod;
		}
		
		
		return dp[n];
	}
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0){
			int n=sc.nextInt();
			long x=climbStairs(n);
			System.out.println(x);
		}
                      // Your code here
	}
	
}