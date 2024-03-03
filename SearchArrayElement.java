import java.util.*;

public class SearchArrayElement {

         public static boolean search(int Arr[], int key) {

                  for (int i = 0; i < Arr.length; i++) {
                           if (Arr[i] == key) {
                                    return true;
                           }
                  }
                  return false;

         }

         public static void main(String[] args) {
                  int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

                  int key;
                  Scanner sc = new Scanner(System.in);

                  System.out.println("Enter the key:");
                  key = sc.nextInt();
                  System.out.println(search(array, key));
         }

}
