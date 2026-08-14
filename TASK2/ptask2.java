

import java.util.*;

public class ptask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, double[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            double temp = sc.nextDouble();

            if (temp > 50) {
                if (!map.containsKey(id))
                    map.put(id, new double[2]);

                map.get(id)[0] += temp;
                map.get(id)[1]++;
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort((a, b) ->
                Double.compare(
                        map.get(b)[0] / map.get(b)[1],
                        map.get(a)[0] / map.get(a)[1]
                )
        );

        for (String id : list) {
            double avg = map.get(id)[0] / map.get(id)[1];
            System.out.println(id + " " + avg);
        }
    }
}