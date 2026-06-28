//to find the missing number in an array
//*Brute Force Approach */

import java.util.Scanner;
public class BMissingNumber {
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

        //to check if the number exists in the array through linear search
        //k is the number we are trying to find in the array
        for (int k = 1; k <= n; k++) {
            //this loop checks every number from 1 to n
            int flag = 0;
            //*Using Linear Search */
            for (int j = 0; j < n- 1; j++) {
                if (arr[j] == k) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Missing Number: " + k);
                return;
            //*If after checking the whole array, the number is missing, return it immediately */
            }
        }
    }
}

//*Time Complexity: O(n²) — Because for every number from 1 to n, we perform a linear search through the array. */
//*Space Complexity: O(1) — Only a few extra variables are used; no additional data structures are required. */
