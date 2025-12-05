# SubArray-Count
Given an integer array arr[] and a value K, the task is to count how many subarrays have a sum greater than or equal to K.


Counting Subarrays Above a Threshold
This is a simple Java program that counts how many groups of numbers (subarrays) hit a certain total sum threshold value.
How It Works (The Cool Part)
The code uses the "Sliding Window" trick. Instead of doing slow calculations for every single window, we just slide one window across the numbers one spot at a time. It makes the code super fast (O(N) complexity)!
Run It Yourself
Save the code as SubarrayCount.java.
Compile: javac SubarrayCount.java
Run: java SubarrayCount
Just follow the prompts for the array size, threshold, window size (k), and the numbers.
Example
If you use:
5 (size), 10 (threshold), 3 (k), and the numbers 1 4 2 10 2
...it will tell you the answer is 2.
