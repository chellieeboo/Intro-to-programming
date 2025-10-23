import java.util.Scanner;

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println(" Choose a Shape ");
        System.out.println("====================");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            
            System.out.print("Enter base: ");
            double base = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            double area = 0.5 * base * height;

            System.out.println("====================");
            System.out.println("| Area of Triangle |");
            System.out.println("====================");
            System.out.println("Base = " + base);
            System.out.println("Height = " + height);
            System.out.println("Area = " + area);

        } else if (choice == 2) {
            
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            double area = length * width;

            System.out.println("========================");
            System.out.println("| Area of a Rectangle |");
            System.out.println("========================");
            System.out.println("Length = " + length);
            System.out.println("Width = " + width);
            System.out.println("Area = " + area);

        } else if (choice == 3) {
        
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            double pi = 3.1416;
            double area = pi * radius * radius;

            System.out.println("====================");
            System.out.println("| Area of a Circle |");
            System.out.println("====================");
            System.out.println("Pi = " + pi);
            System.out.println("Radius = " + radius);
            System.out.println("Area = " + area);

    }
    }
}
 