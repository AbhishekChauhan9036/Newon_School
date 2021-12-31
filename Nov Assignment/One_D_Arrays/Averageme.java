
import java.util.Scanner;

public class Averageme {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }
            double avg = Math.floor(sum / n);
            int res = (int) avg;
            System.out.println(res);
        }
    }
}