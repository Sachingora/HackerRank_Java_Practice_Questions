import java.util.Scanner;

public class calculator {

         public static void cal(int ch, int a, int b) {
                  switch (ch) {
                           case '+':
                                    System.out.println("Addition: " + (a + b));
                                    break;
                           case '-':
                                    System.out.println("Subtraction: " + (a - b));
                                    break;
                           case '*':
                                    System.out.println("Multipication: " + (a * b));
                           case '/':
                                    if (b == 0) {

                                             System.out.println("Division: " + Float.NaN);
                                    } else {
                                             System.out.println("Division: " + (a / b));
                                    }

                                    break;
                           case '%':
                                    System.out.println("Mod: " + (a % b));
                                    break;

                           default:
                                    System.out.println("Invalid Input");
                                    break;
                  }
         }

         public static void main(String[] args) {
                  char ch;
                  int a, b;

                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the first number:");
                  a = sc.nextInt();
                  System.out.println("Enter the Second number: ");
                  b = sc.nextInt();
                  System.out.println("Enter the operator: ");

                  ch = sc.next().charAt(0);
                  cal(ch, a, b);
         }
}
