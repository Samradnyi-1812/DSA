//to check if the array is sorted or not

import java.util.Scanner;

public class isSorted {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i-1]) {
                System.out.println("The array is not sorted in increasing order.");
                return;
            }
        }
        System.out.println("The array is sorted in increasing order.");
    }
}

//*Time complexity: O(n) where n is the size of the array. We traverse the array once to check if it is sorted or not.*n