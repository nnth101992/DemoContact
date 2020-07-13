import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        Menu.showMenu();

        do {
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                case "2":

                case "3":

                case "4":

                case "5":

                case "6":

                case "7":

                case "8":
                    break;
                default:
                    System.out.println("Wrong format of choice");
                    Menu.showMenu();
                    break;
            }
        } while (!choice.equals("8"));
    }
}
