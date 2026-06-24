//to find the intersection of two sorted arrays
//*Brute Force Approach */

import java.util.ArrayList;
import java.util.Scanner;

public class BIntersection {
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

        int[] visited = new int[m];

        for (int i = 0; i < n; i++) {

            //Skip duplicate values in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                continue;
            }

            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    ans.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                //Since arrays are sorted, no need to check further
                if (arr2[j] > arr1[i]) {
                    break;
                }
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