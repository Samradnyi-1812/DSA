//find the union and intersection of two sorted arrays
//*Brute Force Approach*/

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        //input for array 1
        System.out.print("Enter the elements of the array1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        //input for array 2
        System.out.print("Enter the elements of the array2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

         // Create a Set
        Set<Integer> set = new HashSet<>();

        // Add elements of first array
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        // Add elements of second array
        for (int i = 0; i < n; i++) {
            set.add(arr2[i]);
        }

        // Store union in an array
        int[] union = new int[set.size()];
        int j = 0;

        for (int it : set) {
            union[j++] = it;
        }

        // Print Union
        System.out.print("Union: ");
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }

        sc.close();
    }
}
