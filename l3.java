import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        System.out.print("Enter the interval: ");
        int interval = input.nextInt();

        System.out.print("Enter the maximum number: ");
        int max = input.nextInt();

        if (start > max) {
            System.out.println(start + " is larger than " + max);
            System.out.println("Starting number should be lower than the maximum number!");
            System.out.println("Bye!");
        } else {
            int i = start;
            while (i <= max) {
                System.out.println(i);
                i += interval;
            }
        }
    }
}


