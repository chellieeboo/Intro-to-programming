public class cp {
    public static void main(String[] args) {
        
        // Employee 1: Maria Makiling
        String name1 = "Maria Makiling";
        int skill1 = 1;
        int hoursWorked1 = 42;
        int ratePerHour1 = 800;  // kasi skill 1

        int regularHours1, overtimeHours1;
        if (hoursWorked1 > 40) {
            regularHours1 = 40;
            overtimeHours1 = hoursWorked1 - 40;
        } else {
            regularHours1 = hoursWorked1;
            overtimeHours1 = 0;
        }

        double regularPay1 = regularHours1 * ratePerHour1;
        double overtimePay1 = overtimeHours1 * ratePerHour1 * 1.5;
        double grossPay1 = regularPay1 + overtimePay1;
        double tithe1 = grossPay1 * 0.10;
        double netPay1 = grossPay1 - tithe1;

        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Name: " + name1);
        System.out.println("Skill Level: " + skill1);
        System.out.println("Hours Worked: " + hoursWorked1);
        System.out.println("Rate per Hour: " + ratePerHour1);
        System.out.println("Overtime Hours: " + overtimeHours1);
        System.out.println("Regular Pay: " + regularPay1);
        System.out.println("Overtime Pay: " + overtimePay1);
        System.out.println("Gross Pay: " + grossPay1);
        System.out.println("Tithe (10%): " + tithe1);
        System.out.println("Net Pay: " + netPay1);

        // Employee 2: Juan Dela Cruz
        String name2 = "Juan Dela Cruz";
        int skill2 = 3;
        int hoursWorked2 = 35;
        int ratePerHour2 = 500;  // kasi skill 3

        int regularHours2, overtimeHours2;
        if (hoursWorked2 > 40) {
            regularHours2 = 40;
            overtimeHours2 = hoursWorked2 - 40;
        } else {
            regularHours2 = hoursWorked2;
            overtimeHours2 = 0;
        }

        double regularPay2 = regularHours2 * ratePerHour2;
        double overtimePay2 = overtimeHours2 * ratePerHour2 * 1.5;
        double grossPay2 = regularPay2 + overtimePay2;
        double tithe2 = grossPay2 * 0.10;
        double netPay2 = grossPay2 - tithe2;

        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Name: " + name2);
        System.out.println("Skill Level: " + skill2);
        System.out.println("Hours Worked: " + hoursWorked2);
        System.out.println("Rate per Hour: " + ratePerHour2);
        System.out.println("Overtime Hours: " + overtimeHours2);
        System.out.println("Regular Pay: " + regularPay2);
        System.out.println("Overtime Pay: " + overtimePay2);
        System.out.println("Gross Pay: " + grossPay2);
        System.out.println("Tithe (10%): " + tithe2);
        System.out.println("Net Pay: " + netPay2);

        // Employee 3: Joe Smith
        String name3 = "Joe Smith";
        int skill3 = 2;
        int hoursWorked3 = 45;
        int ratePerHour3 = 650;  // kasi skill 2

        int regularHours3, overtimeHours3;
        if (hoursWorked3 > 40) {
            regularHours3 = 40;
            overtimeHours3 = hoursWorked3 - 40;
        } else {
            regularHours3 = hoursWorked3;
            overtimeHours3 = 0;
        }

        double regularPay3 = regularHours3 * ratePerHour3;
        double overtimePay3 = overtimeHours3 * ratePerHour3 * 1.5;
        double grossPay3 = regularPay3 + overtimePay3;
        double tithe3 = grossPay3 * 0.10;
        double netPay3 = grossPay3 - tithe3;

        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Name: " + name3);
        System.out.println("Skill Level: " + skill3);
        System.out.println("Hours Worked: " + hoursWorked3);
        System.out.println("Rate per Hour: " + ratePerHour3);
        System.out.println("Overtime Hours: " + overtimeHours3);
        System.out.println("Regular Pay: " + regularPay3);
        System.out.println("Overtime Pay: " + overtimePay3);
        System.out.println("Gross Pay: " + grossPay3);
        System.out.println("Tithe (10%): " + tithe3);
        System.out.println("Net Pay: " + netPay3);
    }
}

