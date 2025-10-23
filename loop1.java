public class loop1 {
    public static void main(String[] args) {
        int i = 0;

    
        while (i < 10) {
            System.out.print("*");
            i++;
        }

        System.out.println(); 

        i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

     
        int num = 100;
        while (num <= 160) {
            System.out.print(num + " ");
            num += 20;
        }

        System.out.println(); 

        int count = 0;
        while (count < 5) {
            System.out.println("Maria");
            count++;
        }
    }
} 