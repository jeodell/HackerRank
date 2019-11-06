import java.io.*;
import java.util.*;

public class CountingValleys {

  // Complete the countingValleys function below.
  static int countingValleys(int n, String s) {
    if(n < 2 || n > Math.pow(10, 6)) {
      System.exit(1);
    }
    if(!onlyUOrD(s)) {
      System.exit(1);
    }
    int seaLevel = 0;
    int numValleys = 0;
    char[] charArray = s.toCharArray();
    for (char c : charArray) {
      if (seaLevel == 0) {
        if (c == 'U') {
          seaLevel++;
        } else {
          seaLevel--;
          numValleys++;
        }
      } else if(seaLevel > 0) {
        if(c == 'U') {
          seaLevel++;
        } else {
          seaLevel--;
        }
      } else {
        if(c == 'U') {
          seaLevel++;
        } else {
          seaLevel--;
        }
      }
    }
    return numValleys;
  }

  static boolean onlyUOrD(String s) {
    return s.matches("[U|D]+");
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String s = scanner.nextLine();

    int result = countingValleys(n, s);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
