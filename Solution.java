// Day 0: Mean, Median, and Mode
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int[] arr = new int[x];
        double sum = 0;
        double median = 0;
        
        // ADDING ALL VALUES TO ARRAY + FINDING SUM OF ALL VALUES
        for (int i = 0; i < x; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        
        // SORTING ARRAY TO FIND MEDIAN 
        Arrays.sort(arr);
        if (x % 2 == 0) { // EVEN NUMBER OF ELEMENTS
            median = (arr[x/2] + arr[x/2-1])/2.0;
        }
        else median = arr[x/2]; // ODD NUMBER OF ELEMENTS
        
        
        // FINDING THE MODE
        int maxmode = 0;
        int maxo = 0;
        int curro = 0;
        int currmode = 0;
        
        for (int i = 0; i < arr.length-1; i ++) {
            if (arr[i] == arr[i+1]) {
                curro++;
                currmode = arr[i];
            }
            else {
                curro = 0;
            }
            
            if (curro > maxo) {
                maxo = curro;
                maxmode = currmode;
            }
        }
        
        // IN THE CASE THAT ALL ELEMENTS ONLY OCCUR ONCE
        if (maxmode == 0) {
            maxmode = arr[0];
        }
        
        System.out.println(sum/x); // MEAN
        System.out.println(median);
        System.out.println(maxmode);
        
        
    }
    
}
