import java.util.Scanner;

public class ReverseOfArray {
         static void reverse(int arr[]) {
                  System.out.print("");
                  System.out.println("Array after reverse: ");
                  for (int i = arr.length; i > 0; i--) {
                           System.out.print(" " + arr[i]);

                  }
         }

         public static void main(String[] args) {
                  int[] arr = new int[10];

                  for (int i = 0; i < arr.length; i++) {
                           Scanner sc = new Scanner(System.in);
                           System.out.print("arr[" + i + "]=");
                           arr[i] = sc.nextInt();

                  }
                  System.out.println("Array before reverse: ");

                  for (int i = 0; i < arr.length; i++) {
                           System.out.print(" " + arr[i]);
                  }

                  reverse(arr);
         }
}
