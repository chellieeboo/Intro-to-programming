import java.util.Scanner;

public class bankcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

        System.out.print("Client name: ");
        String clientName = scanner.nextLine();

        int choice;

        do {
            System.out.println("\nTransaction Menu");
            System.out.println("[1] Deposit");
            System.out.println("[2] Withdraw");
            System.out.println("[3] Check Balance");
            System.out.println("[4] Fund Transfer (not yet implemented)");
            System.out.println("[0] Exit");
            System.out.print("Type the number of your transaction: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the bill name: ");
                    String depositBill = scanner.nextLine();

                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("\nDeposit successful.");
                        System.out.println("New balance: " + balance);
                    } else {
                        System.out.println("\nInvalid deposit amount.");
                    }
                    break;

                case 2:
                    System.out.print("\nEnter the bill name: ");
                    String withdrawBill = scanner.nextLine();

                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("\nWithdrawal successful.");
                        System.out.println("Remaining balance: " + balance);
                    } else {
                        System.out.println("\nInsufficient balance or invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("\nCurrent balance: " + balance);
                    break;

                case 4:
                    System.out.println("\nFund transfer is not yet implemented.");
                    break;        
                default:
                    System.out.println("\nInvalid option selected.");
            }

      
    }
}

