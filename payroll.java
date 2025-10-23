import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Skill Level (1, 2, 3): ");
        int skill = sc.nextInt();

        System.out.print("Enter Hours Worked: ");
        int hoursWorked = sc.nextInt();

        
        int ratePerHour = 0;
        if (skill == 1) {
            ratePerHour = 800;
        } else if (skill == 2) {
            ratePerHour = 650;
        } else if (skill == 3) {
            ratePerHour = 500;
        } else {
            System.out.println("Invalid skill level!");
            ratePerHour = 0;
        }

        int regularHours;
        if (hoursWorked > 40) {
            regularHours = 40;
        } else {
            regularHours = hoursWorked;
        }

        int overtimeHours;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        } else {
            overtimeHours = 0;
        }

        double regularPay = regularHours * ratePerHour;
        double overtimePay = overtimeHours * ratePerHour * 1.5;
        double grossPay = regularPay + overtimePay;
        double tithe = grossPay * 0.10;
        double netPay = grossPay - tithe;

     
        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Skill Level: " + skill);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Regular Pay: " + regularPay);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Tithe (10%): " + tithe);
        System.out.println("Net Pay: " + netPay);

    }
}


           
    


