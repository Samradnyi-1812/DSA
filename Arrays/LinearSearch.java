//Linear Search

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");

        //input
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        //number to search
        System.out.print("Number to be serached: ");
        int key = sc.nextInt();

        //The boolean found variable is used to remember whether the element was found while the loop is running.
        boolean found = false;
        
        //Linear Search
        for (int i = 0; i <n; i++) {
            if (arr[i] == key) {
                System.out.print("Number found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
        System.out.print("Number not found");
    }    
        sc.close();
    }
}

//*Time Complexity: O(N) The target element is at the final position or completely absent, forcing a full traversal of the collection. */
//*Space Complexity: O(1) as except for the variable to iterate through the list, no other variable is used. */