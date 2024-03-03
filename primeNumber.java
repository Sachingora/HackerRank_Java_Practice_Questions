import java.util.Scanner;

public class primeNumber {

         public static boolean primeORnot(int n) {
                  int count = 0;
                  for (int i = 1; i <= n; i++) {
                           if (n % i == 0) {
                                    count++;
                           }
                  }
                  if (count > 2) {
                           return false;
                  } else {
                           return true;
                  }
         }

         public static void main(String arg[]) {
                  int num;
                  System.out.println("Enter the value of Num: ");
                  Scanner sc = new Scanner(System.in);
                  num = sc.nextInt();

                  primeORnot(num);

                  if (primeORnot(num) == true) {
                           System.out.println(num + " is Prime. ");
                  } else {
                           System.out.println(num + " is not Prime. ");
                  }
         }
}
