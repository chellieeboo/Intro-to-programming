import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; 

        System.out.print("Client name: ");
        String clientName = scanner.nextLine();

        System.out.println("\nTransaction");
        System.out.println("[1] Deposit");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Check Balance");
        System.out.println("[4] Fund Transfer (not yet implemented)");
        System.out.print("Type the number of your transaction: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            System.out.print("\nEnter the bill name: ");
            String billName = scanner.nextLine();

            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();

            if (amount > 0) {
                balance += amount;
                System.out.println("\nDeposit successful.");
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("\nInvalid deposit amount.");
            }

        } else if (choice == 2) {
            System.out.print("\nEnter the bill name: ");
            String billName = scanner.nextLine();

            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("\nWithdrawal successful.");
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("\nInsufficient balance or invalid amount.");
            }

        } else if (choice == 3) {
            System.out.println("\nCurrent balance: " + balance);

        } else if (choice == 4) {
            System.out.println("\nFund transfer is not yet implemented.");

        } else {
            System.out.println("\nInvalid option selected..");
        }

    }
}




