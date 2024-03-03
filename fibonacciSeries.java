import java.util.*;

public class fibonacciSeries {

         public static void Fibonacci(int a, int b, int cnt) {

                  System.out.print(a + " ");
                  System.out.print(b + " ");
                  for (int i = 1; i <= cnt - 2; i++) {
                           int c;
                           c = a + b;
                           System.out.print(c + " ");
                           a = b;
                           b = c;

                  }
         }

         public static void main(String[] args) {

                  int a, b, count;
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the value of A: ");
                  a = sc.nextInt();
                  System.out.println("Enter the value of B: ");
                  b = sc.nextInt();
                  System.out.println("Enter the max limit of Fibonacci Serises: ");
                  count = sc.nextInt();
                  Fibonacci(a, b, count);
         }
}
