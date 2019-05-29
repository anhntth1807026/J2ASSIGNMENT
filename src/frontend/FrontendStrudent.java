package frontend;

import controller.StudentController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class FrontendStrudent {
    private StudentController studentController = new StudentController();
    private Scanner scanner = new Scanner(System.in);

    public void generateStudentMenu() throws SQLException, IOException {
        while (true) {
            System.out.println("~~~~~~~~~~Menu~~~~~~~~~~");
            System.out.println("1. Add.");
            System.out.println("2. Save.");
            System.out.println("3. Display all Student.");
            System.out.println("4. Exit.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentController.add();
                    break;
                case 2:
                    studentController.save();
                    break;
                case 3:
                    studentController.display();
                    break;
                case 4:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Wrong choice, please enter a number between 1 and 4.");
                    break;
            }
            if (choice == 4) {
                break;
            }
        }
    }
}
