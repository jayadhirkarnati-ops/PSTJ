import java.util.*;

public class ptask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String pass = sc.next();

            if (user.equals("admin") && pass.equals("admin123"))
                System.out.println("SUCCESS");
            else
                System.out.println("FAILURE");
        }
    }
}