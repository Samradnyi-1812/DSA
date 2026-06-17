//to rotate an array by d elements
//*Placement Important*/

import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate:");
        int d = sc.nextInt();
        d = d % n; // handle d > n

        int[] temp = new int[d];

        // Store first d elements in temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Place stored elements at the end
        for (int i = n - d, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }

        //print the rotated array
        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}