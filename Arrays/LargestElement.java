//to print the largest element in an array

import java.util.Scanner;

public class LargestElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        
        //input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //finding the largest element 
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
         System .out.println("Largest element in the array is:" + largest);
        sc.close();
    }
}

//*Time complexity: O(n) where n is the size of the array. We traverse the array once to find the largest element.*