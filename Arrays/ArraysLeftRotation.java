import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraysLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int numElem = a.length;
        int spotsToMove = d % a.length;
        int newArr[] = new int[numElem];
        for(int i = 0; i < numElem; i++) {
            int diff = i - spotsToMove;
            if(diff < 0) {
                newArr[numElem + diff] = a[i];
            } else {
                newArr[i - spotsToMove] = a[i];
            }
        }
        return newArr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
                System.out.print(" ");
            }
        }

        System.out.println();

//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
