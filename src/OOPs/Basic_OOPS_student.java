package OOPs;

class Student {
    String name;
    String father_name;
    int age;
    double percent;
    char gender;

    Student(String name, String father_name, int age, double percent, char gender) {
        this.name = name;
        this.father_name = father_name;
        this.age = age;
        this.percent = percent;
        this.gender = gender;
    }

    void display_grade() {
        String grade;
        if(percent >= 90) grade = "A+";
        else if (percent >= 80) grade = "A";
        else if (percent >= 70) grade = "B+";
        else if (percent >= 60) grade = "B";
        else if (percent >= 50) grade = "C+";
        else if (percent >= 40) grade = "C";
        else grade = "F";

        System.out.println(this.name + ", grade is " + grade);

    }
}

public class Basic_OOPS_student {
    public static void main(String[] args) {
        Student archit = new Student("Archit", "Trilok", 20, 85, 'M');
        archit.display_grade();

        Student rishabh = new Student("Rishabh", "Shankar", 25, 70, 'M');
        rishabh.display_grade();
    }
}
