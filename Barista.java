import java.util.Scanner;

public class Barista {
    String name;
    String greetCustomer;
    int yearsOfExperience;

    public Barista(String name, String greetCustomer, int yearsOfExperience) {
        this.name = name;
        this.greetCustomer = greetCustomer;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void serveCustomer() {
        System.out.println(name + " says: " + greetCustomer + " I've been doing this for " + yearsOfExperience + " years!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 3 baristas
        Barista[] baristas = {
            new Barista("Anna", "Hi there! Ready to make your favorite drink!", 5),
            new Barista("Marco", "Good day! Let's brew something special.", 3),
            new Barista("Sofia", "Hello! I'll make this your best coffee yet!", 7) // Fixed line
        };

        // Ask user who they want to be served by
        System.out.print("Who do you want to serve you (Anna, Marco, Sofia)? ");
        String selectedName = scanner.nextLine().trim(); // Trim whitespace

        if (selectedName.isEmpty()) {
            System.out.println("You must enter a name.");
        } else {
            boolean found = false;
            for (Barista b : baristas) {
                if (b.name.equalsIgnoreCase(selectedName)) {
                    b.serveCustomer();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Sorry, we don't have a barista named " + selectedName + ".");
            }
        }

        scanner.close();
    }
}