import java.util.Scanner;

public class methode {
         public static void main(String arg[]) {
                  int a, b;
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the value of a: ");
                  a = sc.nextInt();
                  System.out.println("Enter the value of b: ");
                  b = sc.nextInt();
                  methode_1(a, b);
                  methode_2(a, b);
                  methode_3(a, b);
                  System.out.println(methode_1(a, b));
                  System.out.println(methode_2(a, b));
                  System.out.println(methode_3(a, b));
         }

         public static int methode_1(int a, int b) {

                  return a * b;
         }

         public static int methode_2(int a, int b) {

                  return a ^ b;
         }

         public static int methode_3(int a, int b) {

                  return a + a;
         }
}
