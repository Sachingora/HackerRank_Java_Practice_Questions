import java.util.Scanner;

public class Factorial {

         public static int Fact(int n) {
                  int fact = 1;
                  if (n > 0) {

                           while (n > 0) {
                                    fact = fact * n;
                                    n--;
                           }
                           return fact;
                  } else {
                           return -1;
                  }
         }

         public static void main(String[] args) {
                  int num;
                  System.out.println("Enter the value of num: ");

                  Scanner sc = new Scanner(System.in);
                  num = sc.nextInt();

                  int sol = Fact(num);

                  if (sol == -1) {
                           System.out.println("Number should be non-negative");

                  } else {

                           System.out.println("Factorial of" + num + " :" + sol);
                  }

         }
}
