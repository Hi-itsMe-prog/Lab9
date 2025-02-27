import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("John Doe", "01.09.2005", "123 Main St", "555-1234", "3", "Computer Science");
        students[1] = new Student("Jane Smith", "15.09.2000", "456 Oak Ave", "555-5678", "2", "Engineering");
        students[2] = new Student("Peter Jones", "10.09.2009", "789 Pine Ln", "555-9012", "3", "Computer Science");

        Scanner in = new Scanner(System.in);

        System.out.println("Names of all students:");
        for (Student student : students) {
            System.out.println(student.getname());
        }

        System.out.print("Enter the needed faculty: ");
        String facultyInput = in.nextLine();
        System.out.printf("Students of %s faculty:\n", facultyInput);
        boolean foundFaculty = false;
        for (Student student : students) {
            if (student.getfaculty().equalsIgnoreCase(facultyInput)) {
                System.out.println(student.getname());
                foundFaculty = true;
            }
        }
        if (!foundFaculty) {
            System.out.println("No students found for this faculty.");
        }

        System.out.print("Enter the needed birthyear: ");
        int birthYearInput = in.nextInt();
        System.out.printf("Students entered after %d:\n", birthYearInput);
        boolean foundYear = false;
        for (Student student : students) {
            int studentBirthYear = Integer.parseInt(student.getEnterDate().substring(6));
            if (studentBirthYear > birthYearInput) {
                System.out.println(student.getname());
                foundYear = true;
            }
        }
        if (!foundYear) {
            System.out.println("No students found born after this year.");
        }
    }
}

class Student {
    private String name;
    private String enterDate; // Originally a String, could be changed to LocalDate
    private String address;
    private String phonenumb;
    private String course;
    private String faculty;

    public Student(String name, String enterDate, String address, String phonenumb, String course, String faculty) {
        this.name = name;
        this.enterDate = enterDate;
        this.address = address;
        this.phonenumb = phonenumb;
        this.course = course;
        this.faculty = faculty;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getEnterDate() {
        return this.enterDate;
    }

    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate;
    }

    public String getaddress() {
        return this.address;
    }

    public String getphonenumb() {
        return this.phonenumb;
    }

    public void setphonenumb(String phonenumb) {
        this.phonenumb = phonenumb;
    }

    public void setcourse(String course) {
        this.course = course;
    }

    public String getfaculty() {
        return this.faculty;
    }
}
