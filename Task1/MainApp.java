package Task1;

public class MainApp {

    public static void main(String[] args) {

        String fileName = "sample.txt";
        FileManager fileManager = new FileManager(fileName);
        FileMenu menu = new FileMenu(fileManager);

        menu.displayMenu();
    }
}
