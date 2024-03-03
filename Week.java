import java.util.Scanner;

public class Week {

         static String dyaName(int num) {
                  String st = "";
                  switch (num) {
                           case 1:
                                    // System.out.println("Sunady");
                                    st = "Sunday";
                                    break;

                           case 2:
                                    st = "Monday";
                                    break;

                           case 3:
                                    st = "Tuesday";
                                    break;

                           case 4:
                                    st = "Wednesday";
                                    break;

                           case 5:
                                    st = "Thrusday";
                                    break;

                           case 6:
                                    st = "Friday";
                                    break;

                           case 7:
                                    st = "Saturday";
                                    break;

                           default:
                                    st = "Invalid input";
                                    break;
                  }
                  return st;
         }

         public static void main(String[] args) {
                  int num;
                  Scanner sc = new Scanner(System.in);
                  System.out.print("Enter the value of num: ");
                  num = sc.nextInt();

                  String st = dyaName(num);

                  System.out.println(st);

         }
}
