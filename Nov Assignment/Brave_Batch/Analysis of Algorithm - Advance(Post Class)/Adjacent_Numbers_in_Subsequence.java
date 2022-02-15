import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int input[] = new int[N];
        int dp[] = new int[N];

        for(int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();

            dp[i] = 1;
        }

        int result = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if((input[i] == input[j] + 1)
                || input[i] == input[j] - 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}