import java.util.Scanner;

public class MaxBwThreeNum {

         static int max(int num1, int num2, int num3) {

                  if (num1 > num2 && num1 > num3) {
                           return num1;
                  } else if (num2 > num1 && num2 > num3) {
                           return num2;
                  } else {
                           return num3;
                  }

         }

         public static void main(String[] args) {
                  int a, b, c;

                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the value of A: ");
                  a = sc.nextInt();
                  System.out.println("Enter the value of B: ");
                  b = sc.nextInt();
                  System.out.println("Enter the value of C: ");
                  c = sc.nextInt();

                  max(a, b, c);

                  System.out.println("Max number is " + max(a, b, c));
         }

}
