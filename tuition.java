 import java.util.Scanner;

public class tuition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String studentName;
         double tuitionFee;
         double amountPaid;

          System.out.print("Enter Student Name: ");
          studentName = sc.nextLine();

         System.out.print("Enter Total Tuition Fee: ");
         tuitionFee = sc.nextDouble();

         System.out.print("Enter Amount Paid: ");
         amountPaid = sc.nextDouble();

         double balance = tuitionFee - amountPaid;

         double downPayment = tuitionFee * 0.40;
        double prelim = tuitionFee * 0.20;
        double midterm = tuitionFee * 0.20;
        double preFinal = tuitionFee * 0.20;

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Tuition Fee: " + tuitionFee);

        System.out.println("\nFinancial Breakdown");
        System.out.println("Down Payment (40%): " + downPayment);
        System.out.println("Prelim (20%): " + prelim);
        System.out.println("Midterm (20%): " + midterm);
        System.out.println("PreFinal (20%): " + preFinal);

        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Balance: " + balance);

    }
}
