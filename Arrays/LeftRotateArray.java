//to left rotate an array by d elements
//*Optimal Solution- Using the Reversal Algorithm*/
//*Placement Important */

import java.util.Scanner;
public class LeftRotateArray {
    public static void reverse(int[] arr, int start, int end){
        while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start ++;
        end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array");
        
        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //no. of positions to shift by
        System.out.println("Enter the number of positions to shift by: ");
        int d = sc.nextInt();
        d = d % n;

        //to reverse the first d elements 
        reverse(arr, 0, d-1);

        //to reverse the remaining elements
        reverse(arr, d, n-1);

        //to reverse the entire array
        reverse(arr, 0, n-1);

        //print the reversed array
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}