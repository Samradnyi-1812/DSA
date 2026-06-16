//to find the second largest element in an array without sorting
//*Placement important*/
import java.util.Scanner;

public class SecondLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");

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
    }
}

//*Time complexity: O(n) where n is the size of the array. We traverse the array twice, once to find the largest element and once to find the second largest element.*