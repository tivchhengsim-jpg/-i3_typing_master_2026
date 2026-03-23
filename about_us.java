import java.util.Scanner;

public class about_us {

    // Task 7: About Us screen
    static void aboutUs() {
        System.out.println("\n------------ About Us -----------");
        System.out.println("Project: I3 Typing Master v2026");
        System.out.println("This program helps users test and improve typing speed.");
        System.out.println("\nDeveloped by:");
        System.out.println("Seng Monika");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. About Us");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    aboutUs();
                    break;
                case 2:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}