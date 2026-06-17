// to remove duplicates in-place from a sorted array
//*Placement Important*/
//*Two- pointer concept*/
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");

        //input
        for (int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
            }
        sc.close();

        //removing duplicates
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.err.println("The new length of the array after removing duplicates is: " + (i + 1));
    }
}

//*Time Complexity: O(n), Space Complexity: O(1) */