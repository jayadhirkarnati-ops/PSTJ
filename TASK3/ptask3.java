import java.util.*;

public class ptask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = sc.nextInt();
        int current = max;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();

            current = Math.max(x, current + x);
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}