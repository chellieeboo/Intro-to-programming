import java.util.Scanner;
    public class vote{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        int year_born = 0;
        int present_year= 0;
        int age;

         System.out.println("Enter the name:");
         name = input.nextLine();

        System.out.println("Enter the born year:");
        year_born = input.nextInt();

        System.out.println("Enter the present year:");
        present_year = input.nextInt();


        age = present_year - year_born;

    
           if(age < 18){
             System.out.println("You are not allowed to vote");
        }
        System.out.print("Your age is: "+ age);


    }
}