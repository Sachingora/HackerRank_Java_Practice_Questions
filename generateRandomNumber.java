import java.lang.Math;
import java.util.Scanner;

public class generateRandomNumber {

         public static void RandomNum(int n) {

                  for (int i = 1; i <= n; i++) {
                           System.out.println(i + " Random Number: " + Math.random());
                  }
         }

         public static void main(String[] args) {
                  int num;
                  System.out.println("Enter the max number to generate: ");
                  Scanner sc = new Scanner(System.in);

                  num = sc.nextInt();
                  RandomNum(num);
         }
}