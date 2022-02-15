import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int input[][] = new int[N][2];
        int dp[] = new int[N];

        for(int i = 0; i < N; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();

            dp[i] = 1;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            int currentMax = 0;
            for(int j = (i - 1); j >= 0; j--) {
                if(input[j][1] < input[i][0]) {
                    currentMax = Math.max(currentMax, dp[j]);
                }
            }

            dp[i] = dp[i] + currentMax;
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}