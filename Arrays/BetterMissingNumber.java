//to find the missing number in an array
//*Better Approach- Using Hashing */

import java.util.Scanner;

public class BetterMissingNumber {
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

        // Hash array of size (n+2)
        // We use n+2 because the numbers range from 1 to (n+1)
        int[] hash = new int[n + 2];

        // Mark the numbers present in the array
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = 1;
        }

        // Find the missing number
        for (int i = 1; i <= n + 1; i++) {
            if (hash[i] == 0) {
                System.out.println("Missing Number: " + i);
                break;
            }
        }
        sc.close();
    }
}