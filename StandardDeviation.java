// Day 1: Standard Deviation

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class StandardDeviation {

    /*
     * Complete the 'stdDev' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void stdDev(List<Integer> arr) {
    // Print your answers to 1 decimal place within this function

        double mean = 0;
        for (int i: arr) {
            mean += i;
        }
        mean /= arr.size();
        
        double standard = 0;
        for (int i: arr) {
            standard += Math.pow(i-mean,2);
        }
        standard = Math.sqrt(standard/arr.size());
        
        System.out.printf("%.1f",standard);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.stdDev(vals);

        bufferedReader.close();
    }
}
