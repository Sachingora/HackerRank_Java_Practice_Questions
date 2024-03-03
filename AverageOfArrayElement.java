public class AverageOfArrayElement {

         public static int average(int arr[], int n) {
                  int sum = 0;
                  for (int i = 0; i < n; i++) {
                           sum = sum + arr[i];

                  }
                  int avg = sum / n;
                  return avg;

         }

         public static void main(String[] args) {
                  int arr[] = { 10, 20, 30, 40, 50 };

                  System.out.println("average=" + average(arr, 5));

         }
}
