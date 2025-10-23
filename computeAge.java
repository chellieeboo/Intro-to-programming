import java.util.Scanner;
    public class computeAge{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int present_year = 2025;
        int year_born = 0;
        int age;
        System.out.println("Enter the born year:");
        year_born = input.nextInt();
        age = present_year - year_born;
        
        System.out.println("Age: " +age);

    }
};