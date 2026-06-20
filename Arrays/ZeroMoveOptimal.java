//to move all zeros to the end of the array
//*Optimal Solution: Using Two- Pointer Approach */

import java.util.Scanner;
public class ZeroMoveOptimal {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    //Step 1
   int  j = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
            j = i;
            break;
        }
    }

    //Step 2
    for (int i = j + 1; i < n; i++) {
        if (arr[i] != 0) {
            swap(arr, i , j);
            j++;
        }
    }

    //print the updated array
    System.out.print("Array after moving the zeros at the end: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    sc.close();
   }
}
