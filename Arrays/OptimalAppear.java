//to find the number that appears once, and other numbers twice 
//*Optimal Solution */

import java.util.Scanner;
public class OptimalAppear {
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

        int xor = 0;

        // XOR all the elements
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        System.out.println("The number that appears only once is: " + xor);
    }
}