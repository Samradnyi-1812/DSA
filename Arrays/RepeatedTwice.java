// To find the number repeated twice
//* Optimal Approach: Using HashMap */

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Print the number repeated twice
        for(int key : map.keySet()){
            if(map.get(key) == 2){
                System.out.println("Number repeated twice: " + key);
            }
        }
        sc.close();
    }
}

//*Time Complexity: O(N) */
//*Space Complexity: O(N) */