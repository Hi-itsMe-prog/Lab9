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

        System.out.println("Enter the needed faculty: ");
        String s = in.nextLine();
        System.out.printf("Students of %s faculty:", s);
        for (Student student : students) {
            if (student.getfaculty().equals(s)) {
                System.out.println(student.getname());
            }
        }

        System.out.println("Enter the needed birthyear: ");
        int a = in.nextInt();
        System.out.printf("Students entered after %d:", a);
        for (Student student : students) {
            if (Integer.parseInt(student.enterDate.substring(6)) > a) {
                System.out.println(student.getname());
            }
        }
    }
}

class Student {
    private String name;
    public String enterDate;
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

    public void setDate(String enterDate) {
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