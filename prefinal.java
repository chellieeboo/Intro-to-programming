// Name: rochelle 
// Date : 10/12/25
 import java.util.Scanner;
 public class prefinal {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int num;
        char choice = 'Y';
         
         while (choice == 'Y' || choice == 'y') {
            System.out.print("Enter any number: ");
            num = input.nextInt();

            if (num == 0) {
                System.out.println("You Entered zero");

            }
            else if (num < 0) {
              System.out.println(num + "is an negative number");
            }
            else if (num % 2 == 0) {
            System.out.println(num + "is an even number");
            }
            else {
                  System.out.println(num + "is an odd number");
            }
             System.out.println("/ntry another number? [Y/N]: ");
             choice = input.next().charAt(0);
             System.out.println();

                
            }
            System.out.println("Thankyou");
         }

        
    } 
 