import java.io.*;
import java.util.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    if(n < 1 || n > 100) {
        System.exit(1);
    }
    Map<Integer, Integer> socks = new HashMap<>();
    for(int i : ar) {
        if(socks.containsKey(i)) {
        socks.put(i, socks.get(i) + 1);
        } else {
        socks.put(i, 1);
        }
    }

    int pairs = 0;
    for(Map.Entry<Integer, Integer> m : socks.entrySet()) {
        pairs += (m.getValue() / 2);
    }
    System.out.println(socks);
    return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
