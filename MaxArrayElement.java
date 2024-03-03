public class MaxArrayElement {
         static int max(int Arr[]) {
                  int n_mux = Integer.MIN_VALUE;
                  for (int i = 0; i < Arr.length; i++) {
                           if (Arr[i] > n_mux) {
                                    n_mux = Arr[i];
                           }
                  }
                  return n_mux;
         }

         public static void main(String[] args) {
                  int arr[] = { 10, 50, 80, 90 };
                  System.out.println("Max element in array :" + max(arr));
         }
}
