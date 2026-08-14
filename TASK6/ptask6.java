import java.util.*;

class ptask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int d = sc.nextInt();

            switch (type) {
                case "Bike":
                    System.out.println(d * 5);
                    break;
                case "Cab":
                    System.out.println(d * 12);
                    break;
                case "Auto":
                    System.out.println(d * 12);
                    break;
                default:
                    System.out.println("Invalid Booking");
            }
        }
    }
}