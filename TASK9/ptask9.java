import java.util.*;

public class ptask9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        try {
            int result = op.equals("+") ? a + b : a / b;
            System.out.println("Test Passed");
        } catch (Exception e) {
            System.out.println("Test Failed");
        }
    }
}