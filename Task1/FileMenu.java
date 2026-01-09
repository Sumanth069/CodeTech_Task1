package Task1;

import java.util.Scanner;

public class FileMenu {

    private FileManager fileManager;
    private Scanner scanner;

    public FileMenu(FileManager fileManager) {
        this.fileManager = fileManager;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;

        do {
            System.out.println("\n--- FILE OPERATIONS MENU ---");
            System.out.println("1. Write to File");
            System.out.println("2. Read File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter content to write: ");
                    fileManager.writeFile(scanner.nextLine());
                    break;
                case 2:
                    fileManager.readFile();
                    break;
                case 3:
                    System.out.print("Enter content to append: ");
                    fileManager.modifyFile(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
