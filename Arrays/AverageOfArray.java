import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.print("Enter the elements:");

        // Input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / size;
        System.out.println("Average = " + average);
        sc.close();
    }
}