import java.util.*;

class ptask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), balance = 0;

        for (int i = 0; i < n; i++) {
            String op = sc.next();
            int amt = sc.nextInt();

            if (op.equals("Deposit"))
                balance += amt;
            else
                balance -= amt;
        }

        System.out.println(balance);
    }
}