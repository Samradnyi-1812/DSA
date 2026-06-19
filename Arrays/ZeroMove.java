//to move all zeros to the end of the array
//*Brute Force Solution */

import java.util.Scanner;
import java.util.ArrayList;
public class ZeroMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");

        //input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //to store all the non-zero numbers 
        ArrayList<Integer> temp = new ArrayList<>(); //creates an empty list whose size grows automatically
        for(int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        //to move all the non-zero numbers at the front 
        int nz = temp.size();  //nz stands for non- zero
        for(int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        //to move all the zeros to the end of the array
        for (int i = nz; i < size; i++) {
            arr[i] = 0;
        }

        //print the updated array
        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}