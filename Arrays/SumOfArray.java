//to calculate the sum of the array

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.print("Enter the elements:");

        // Input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Calculate sum
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements = " + sum);
        sc.close();
    }
}

//*Time Complexity: O(n) */
//*Space Complexity: O(n) */