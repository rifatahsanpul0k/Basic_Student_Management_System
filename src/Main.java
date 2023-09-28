import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a list to store student objects
        List<Student> students = new ArrayList<>();

        // Add an initial student to the list
        Student new1 = new Student("Pulok", "United International University", "Computer Science and Engineering", "112310594", "B+", 1925467576, "rifatahsanpulok@protonmail.com");
        students.add(new1);

        // Main program loop
        while (true) {
            System.out.println("Select an option below: ");
            System.out.println("1.View All Students.\n2.Add Students Information.\n3.Update Information of a Student\n4.Exit");
            Scanner Input = new Scanner(System.in);
            byte choice = Input.nextByte();

            switch (choice) {
                case 1:
                    // View all students in the list
                    for (Student student : students) {
                        System.out.println("Full Name: " + student.fullName);
                        System.out.println("University: " + student.universityName);
                        System.out.println("Department: " + student.department);
                        System.out.println("Student ID: " + student.studentID);
                        System.out.println("Blood Group: " + student.bloodGroup);
                        System.out.println("Mobile: " + student.mobile);
                        System.out.println("Email: " + student.email);
                    }
                    break;

                case 2:
                    // Add a new student to the list
                    Input.nextLine();
                    System.out.println("Enter name: ");
                    String fullName = Input.nextLine();
                    System.out.println("University: ");
                    String universityName = Input.next();
                    System.out.println("Department: ");
                    String department = Input.next();
                    System.out.println("Student ID: ");
                    String studentID = Input.next();
                    System.out.println("Blood Group: ");
                    String bloodGroup = Input.next();
                    System.out.println("Mobile: ");
                    long mobile = Input.nextLong();
                    System.out.println("Email: ");
                    String email = Input.next();
                    Student newStudent = new Student(fullName, universityName, department, studentID, bloodGroup, mobile, email);
                    students.add(newStudent);
                    System.out.println("Student Added Successfully");
                    break;

                case 3:
                    // Update student information
                    System.out.println("Enter Student ID:");
                    String studentIdSearch = Input.next();
                    boolean studentFound = false;

                    // Search for the student by Student ID
                    for (Student student : students) {
                        if (student.studentID.equals(studentIdSearch)) {
                            System.out.println("What do you want to update?");
                            System.out.println("1.Full Name\n2.University\n3.Department\n4.Student ID\n5.Mobile\n6.Email");
                            byte choice3 = Input.nextByte();

                            switch (choice3) {
                                case 1:
                                    System.out.println("Enter New Name: ");
                                    Input.nextLine();
                                    String newName = Input.nextLine();
                                    student.fullName = newName;
                                    break;
                                case 2:
                                    System.out.println("Enter New University Name: ");
                                    Input.nextLine();
                                    String uni = Input.nextLine();
                                    student.universityName = uni;
                                    break;
                                case 3:
                                    System.out.println("Enter New Department: ");
                                    Input.nextLine();
                                    String Dept = Input.nextLine();
                                    student.department = Dept;
                                    break;
                                case 4:
                                    System.out.println("Enter New ID: ");
                                    Input.nextLine();
                                    String newID = Input.nextLine();
                                    student.studentID = newID; // Fix: Update student ID
                                    break;
                                case 5:
                                    System.out.println("Enter Mobile: ");
                                    long newNum = Input.nextLong();
                                    student.mobile = newNum;
                                    break;
                                case 6:
                                    System.out.println("Enter New Email: ");
                                    Input.nextLine();
                                    String newMail = Input.nextLine();
                                    student.email = newMail;
                                    break;
                                default:
                                    System.out.println("Enter any number between 1 to 6");
                                    break;
                            }
                            studentFound = true;
                            break;
                        }
                    }
                    if (!studentFound) {
                        System.out.println("Student ID not found");
                    }
                    break;

                case 4:
                    System.out.println("See you again!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
