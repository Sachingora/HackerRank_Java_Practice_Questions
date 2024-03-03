import java.util.Scanner;

public class DeletionOfArrayElement {
         static void deletion(int Arr[], int key) {
                  int count = 0;
                  for (int i = 0; i < Arr.length; i++) {
                           if (i == key) {
                                    count = 1;
                                    // Arr[i]=0;
                                    Arr[i] = Arr[i + 1];
                           }
                           if (count == 1) {
                                    if (i == Arr.length - 1) {
                                             Arr[i] = 0;
                                    } else
                                             Arr[i] = Arr[i + 1];
                           }
                           // Arr[Arr.length-1]="\n";
                  }

                  for (int i : Arr) {
                           System.out.print(" " + i);
                  }

         }

         public static void main(String[] args) {
                  int arr[] = new int[5];

                  for (int i = 0; i < arr.length; i++) {
                           Scanner ac = new Scanner(System.in);
                           System.out.println("Arr[" + i + "]=");
                           arr[i] = ac.nextInt();
                  }

                  int key;
                  System.out.print("Enter the value of key: ");
                  Scanner sc = new Scanner(System.in);
                  key = sc.nextInt();
                  System.out.println("Lenght of Array Before Deletion: " + arr.length);

                  deletion(arr, key);
         }
}
