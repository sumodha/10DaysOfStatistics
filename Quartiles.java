// Day 1: Quartiles

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

class Quartiles {

    /*
     * Complete the 'quartiles' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    // RETURNS THE MEDIAN OF AN ARRAYLIST
    public static int median(List<Integer> arr) {
        int median;
        if (arr.size() % 2 == 0) {
            median = (arr.get(arr.size()/2)+arr.get(arr.size()/2-1))/2;
        }
        else median = arr.get(arr.size()/2);
        return median;
        

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            
        Collections.sort(data);
        int median = Result.median(data);
        int lower = 0;
        int upper = 0;
        if (data.size() % 2 == 0) {
           lower = Result.median(data.subList(0,data.size()/2));
           upper = Result.median(data.subList(data.size()/2, data.size()));
        }
        else {
            lower = Result.median(data.subList(0,data.size()/2));
           upper = Result.median(data.subList(data.size()/2+1, data.size()));
        }
    

        bufferedWriter.write(lower + "\n" + median+ "\n" + upper);

        bufferedReader.close();
        bufferedWriter.close();
    }
}
