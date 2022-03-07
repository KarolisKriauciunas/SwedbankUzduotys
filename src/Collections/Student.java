package Collections;

public class Student {
    private  String name;
    private int grade;
    private int age;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }

    public Student(String name, int grade, int age, int ID) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.ID = ID;
    }
}
