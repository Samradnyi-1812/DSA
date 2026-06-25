//to find the third largest element in an array
//*Placement Important */

import java.util.Scanner;
public class ThirdLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of the array: ");

        //input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //to find the largest
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);

        //to find the second largest
        //*In case the array has -ve numbers, take int slargest = INT_MAX*/
        int slargest = -1;
        for (int i = 0; i <size; i++) {
            if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: " + slargest);
        sc.close();

        //to find the third largest 
        int tlargest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > tlargest && arr[i] != largest && arr[i] != slargest) {
                tlargest = arr[i];
            }
        }
        System.out.println("The third largest element in the array is: " + tlargest);
    }
}

//*Time Complexity: O(3N) ≈ O(N)*/
//*Space Complexity: O(1)*/
