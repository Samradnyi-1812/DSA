//Take an array as input from the user . Search for a given number x and print the index at which it occurs.

import java.util.Scanner;

public class Array2 {
  public static void main(String args[]) {
    Scanner sc1 = new Scanner (System.in);
    int size = sc1.nextInt();
    int numbers[] = new int[size];

    //input
    for (int i = 0; i<numbers.length; i++) {
      numbers[i] = sc1.nextInt();
    }

    int x = sc1.nextInt();   //Number x to search for 
  
    //output
    for (int i = 0; i<numbers.length; i++) {
     if (numbers[i]==x) {
      System.out.println("x found at index " + i);
      sc1.close();

     }
    }
  }
}

//*Time complexity: O(n) where n is the size of the array. We traverse the array once to search for the number x.*
