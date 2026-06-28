// To find the missing number in an array
//*Optimal Approach (Using XOR)*/

import java.util.Scanner;

public class XORMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();     // Array size = N - 1
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int XOR1 = 0;
        int XOR2 = 0;

        // XOR of numbers from 1 to (n+1)
        for (int i = 1; i <= n + 1; i++) {
            XOR1 = XOR1 ^ i;
        }

        // XOR of array elements
        for (int i = 0; i < n; i++) {
            XOR2 = XOR2 ^ arr[i];
        }

        // Missing number
        int missing = XOR1 ^ XOR2;
        System.out.println("Missing Number: " + missing);
        sc.close();
    }
}