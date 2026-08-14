import java.util.*;

public class ptask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int n = text.length();
        int m = pattern.length();

        int[] lps = new int[m];
        int j = 0;

        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j))
                j = lps[j - 1];

            if (pattern.charAt(i) == pattern.charAt(j))
                j++;

            lps[i] = j;
        }

        j = 0;

        for (int i = 0; i < n; i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j))
                j = lps[j - 1];

            if (text.charAt(i) == pattern.charAt(j))
                j++;

            if (j == m) {
                System.out.print((i - m + 1) + " ");
                j = lps[j - 1];
            }
        }
    }
}