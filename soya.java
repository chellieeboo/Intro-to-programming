import java.util.Scanner;
public class soya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Worker's name: ");
        String name = sc.nextLine();

        System.out.print("Mobile Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter number of bottles produced: ");
        int bottles = sc.nextInt();

        double rate = 0, pay = 0, incentive = 0;

        if (bottles >= 1 && bottles <= 49) {
            rate = 3.00;
        } else if (bottles >= 50 && bottles <= 99) {
            rate = 3.50;
        } else if (bottles >= 100 && bottles <= 199) {
            rate = 4.00;
        } else if (bottles >= 200) {
            rate = 4.50;
            if (bottles >= 250) {
                incentive = 100;
            }
        }

        pay = rate * bottles;
        double grossPay = pay + incentive;

        System.out.println("Worker: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Rate per bottle: " + rate);
        System.out.println("Total Pay: " + pay);
        System.out.println("Incentive: " + incentive);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("===============================");
    }
}

