import java.util.Scanner;

public class l2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        System.out.print("Enter the interval: ");
        int interval = input.nextInt();

        System.out.print("Enter the maximum number: ");
        int max = input.nextInt();

      
        int current = start;
        while (current <= max) {
            System.out.println(current);
            current += interval;
        }
    }
}
