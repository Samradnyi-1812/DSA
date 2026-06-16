  //to print the elements of an array
  
  import java.util.Scanner;

  public class Array1 {
    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];
      for (int i = 0; i < size; i++) {
        numbers[i] = sc.nextInt();
      }

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
      sc.close();     
        }
     }
  }

  //*Time complexity: O(n) where n is the size of the array. We traverse the array once to print all elements.*
   