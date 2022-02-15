import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					 Scanner sc = new Scanner(System.in);
    double p = sc.nextDouble();
    System.out.println(find(p));
}
    static int find(double p) {

        return (int) Math.ceil(Math.sqrt(2 * 365 * Math.log(1 / (1 - p))));
    }
}