//to find the number that appears once, and other numbers twice 
//*Brute- Force Approach: Using Two- Pointer */

import java.util.Scanner;
public class BruteAppear {
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

        //*Do linear search on each element of the array to check the no. of times that number has occurred */
        int num;
        int count;

        for (int i = 0; i < n; i++) {
            num = arr[i];
            count = 0;

            //linear search
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count ++;
                }
            }

            if (count == 1) {
                System.out.print("Number that has appeared once: " + num);
            }
        } 
    }
}

//*Time Complexity: O(n²) */
//*Space Complexity: O(1) */
