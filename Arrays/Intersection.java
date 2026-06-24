//to find the intersection of two sorted arrays
//*Optimal Solution: Using Two- Pointer Approach */

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array 1: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of Array 2: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        //input for array 1
        System.out.print("Enter the elements of the array1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        //input for array 2
        System.out.print("Enter the elements of the array2: ");
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        
        //List to store Intersection elements
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n && j < m) {

            //Skip duplicate values in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            
            if (arr1[i] < arr2[j]) {
                i++;
            }

            else if (arr2[j] < arr1[i]) {
                j++;
            }

            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }

        }

        //print the intersection array
        System.out.print("Intersection: ");
        for(int num: ans) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}