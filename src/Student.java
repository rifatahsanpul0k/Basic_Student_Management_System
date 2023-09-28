public class Student {
    String fullName;
    String universityName;
    String department;
    String studentID;
    String bloodGroup;
    long mobile;
    String email;
    //constructing a object named Student
    Student (String fullName,String universityName,String department,String studentID,String bloodGroup, long mobile,String email) {
        this.fullName = fullName;
        this.universityName = universityName;
        this.department = department;
        this.studentID = studentID;
        this.bloodGroup = bloodGroup;
        this.mobile = mobile;
        this.email = email;
    }
}
