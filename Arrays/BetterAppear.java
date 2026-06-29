//to find the number that appears once, and other numbers twice 
//*Better Approach */

import java.util.Scanner;
public class BetterAppear {
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
        sc.close();

        //find the maximum element
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        //Create a hash array of size (max + 1)
        int[] hash = new int[max + 1];

        //Store the frequency of every element
        for (int i = 0; i < n; i++) {
            //it goes to index equal to the value of arr[i] and increases its frequency by 1
            hash[arr[i]]++;
        }

        //Traverse the array again
        for (int i = 0; i < n; i++) {
            //if frequency becomes 1, return that element
            if (hash[arr[i]] == 1) {
                System.out.println("Element appearing once: " + arr[i]);
                return;
            }
        }
    }
}

//*Time Complexity: Overall Time Complexity O(3N) ≈ O(N) */
//* 1. Finding maximum element: O(N) */
//* 2. Counting frequencies: O(N) */
//* 3. Finding the unique element: O(N) */

//*Space Complexity: O(maxElement) i.e. the hash array of size (maximum element + 1)*/

