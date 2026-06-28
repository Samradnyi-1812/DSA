//to find the missing number in an array
//*Optimal Solution 1*/

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();   // Array size = N-1
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Total sum of numbers from 1 to (n+1)
        int sum = (n + 1) * (n + 2) / 2;

        // Sum of elements present in the array
        int S2 = 0;
        for (int i = 0; i < n; i++) {
            S2 += arr[i];
        }

        // Missing number
        int missing = sum - S2;
        System.out.println("Missing Number: " + missing);
        sc.close();
    }
}

//*Time Complexity: O(N) */
//*Space Complexity: O(1) */