import java.util.*;
import java.lang.*;

public class SubarrayCount {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        int n;
        // Input size of array
        System.out.println("Enter the size of array:");
        n = sc.nextInt();

        // Input threshold value
        System.out.println("Enter the threshold value:");
        int threshold = sc.nextInt();
        
        // Input k value
        System.out.println("Enter the k value:");
        int k = sc.nextInt();
        
        int[] arr = new int[n];

        // Input array elements
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int windowSum = 0;

        int count = 0;

        // Calculate sum of first k elements
        for(int i = 0;i<k;i++){
            windowSum += arr[i];
        }

        // Check if the first window's sum meets the threshold
        if(windowSum>=threshold){
            count++;
        }

        // Slide the window and check sums
        for(int i =k;i<n;i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            if(windowSum >= threshold){
                count++;
            }
        }

        // Output the result
        System.out.println("Number of subarrays with sum greater than or equal to threshold: "+ count);



    }
}