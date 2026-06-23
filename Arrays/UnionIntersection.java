//find the union and intersection of two sorted arrays
//*Optimal Approach: Two- pointer approach*/

import java.util.Scanner;
import java.util.ArrayList;

public class UnionIntersection {
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

        //List to store union elements
        ArrayList<Integer> Union = new ArrayList<>();

        //Initialize pointers
        int i = 0, j = 0;

        //Continue until one of the array is completed
        while (i < n && j < m) {
            //if element in the arr1 is smaller 
            if (arr1[i] < arr2[j]){
                //Add if the array is empty- Union.isEmpty()
                //Checks if the last elememt in the union array, and adds if the array does not have any duplicates- Union.size() - 1
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
            i++;
            }

            //if element in the arr2 is smaller 
            else if (arr2[j] < arr1[i]){
                //Add if the array is empty- Union.isEmpty()
                //Checks if the last elememt in the union array, and adds if the array does not have any duplicates- Union.size() - 1
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
            j++;
            }

            //if elements in both the arrays are equal, add once if not duplicate
            else {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
            }
            i++; j++;
        }
    }

        //Append remaining elements from arr1
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
        }
        i++;
    }

        //Append remainind elements from arr2
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
        }
        j++;
    }

    //print the union list
    System.out.print("Union: ");
        for (int num : Union) {
            System.out.print(num + " ");
        }
    sc.close();

    }
}

