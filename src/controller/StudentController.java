package controller;

import entity.StudentDetails;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<StudentDetails> list = new ArrayList<>();

    public void add() {
        System.out.println("Add new student information, please enter the information below: ");
        System.out.println("EnrolID: ");
        String enrolID = scanner.nextLine();
        System.out.println("FirstName: ");
        String firstName = scanner.nextLine();
        System.out.println("LastName: ");
        String lastName = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        StudentDetails StudentDetails = new StudentDetails(enrolID, firstName, lastName, age);
        list.add(StudentDetails);
        System.out.println("Add Student success.");
        System.out.println("\n");
    }

    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\DELL\\IdeaProjects\\Students-Assignment-Final\\src\\students.dat");
        fileWriter.write("   EnrolID   |        Full Name       Age" + "\n");
        fileWriter.write(" ------------|---------------------- -----" + "\n");
        for (StudentDetails student:
             list) {
            fileWriter.write("   " + student.getEnrolID() + "   " + "|" + "   " + (student.getFirstName()) + (student.getLastName()) + "      " + student.getAge() +  "\n");
//            fileWriter.write("             |                       ");
        }
        fileWriter.close();
        System.out.println("Save file success.");
        System.out.println("\n");
    }

    public void display() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\DELL\\IdeaProjects\\Students-Assignment-Final\\src\\students.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        System.out.println("\n");
    }
}
