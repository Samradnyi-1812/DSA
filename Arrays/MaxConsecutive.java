//to find the maximum consecutive ones

import java.util.Scanner;
public class MaxConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");

        //input
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count ++;
                max = Math.max(max, count);
                //built-in method in Java that returns the larger of two numbers.
                //*Math.max(a, b) */
                //*if (a > b) it returns a and vice-versa */

            }
            else {
                count = 0;
            }
        }
        
        //print maximum
        System.out.println("Maximum Consecutive ones: " + max); 
    }
}

//*Time Complexity: O(N) */
//*Space Complexity: O(1) */