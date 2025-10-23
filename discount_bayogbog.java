public class discount_bayogbog {
    public static void main(String[] args) {
         String customerName = "Merlie";
       double amount = 25300.75; 

        double discountRate = 0.03;

         double discount = 759.0225;

            System.out.println("Customer Name : " + customerName);
        System.out.println("Amount        : " + amount);
          System.out.printf("Discount Rate : %02.0f%%\n", discountRate * 100); // Shows 03%
        //  %02.0f = format the number as a whole number with 2 digits, padding with 0 if needed
        System.out.println("Discount      : " + discount);

        




    }
}

