import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
        int numOfTestCase = sc.nextInt();
        for(int i=0;i<numOfTestCase;i++){
			int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(NumOfIncSubSeq(arr,n));
        }
        
	}
	static long NumOfIncSubSeq(int[] arr, int n){
		
		long mod=1000000000+7L;
		long sum = 0L ;
        long[] count = new long[n] ;
            //count[0] = 1L ;
        for(int i=0; i<n; i++) {
            count[i] = 1L ;
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j]) {
                    count[i] = (count[i] + count[j]) % mod ;
                }
			}
            sum = (sum + count[i]) %mod;
        }
		return sum;
	}
}