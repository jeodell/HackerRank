import java.io.*;
import java.util.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
      int currentPosition = 0;
      int arrLen = c.length;
      int numMoves = 0;
      while(currentPosition < arrLen) {
        if(currentPosition + 2 >= arrLen) {
          if(currentPosition + 1 == arrLen) {
            break;
          }
          if(c[currentPosition + 1] != 1) {
            currentPosition++;
            numMoves++;
          }
        } else if (c[currentPosition + 2] != 1) {
          currentPosition += 2;
          numMoves++;
        } else {
          currentPosition++;
          numMoves++;
        }
      }
      return numMoves;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
