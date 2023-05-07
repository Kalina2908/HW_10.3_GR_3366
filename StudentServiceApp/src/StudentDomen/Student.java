package StudentDomen;

/** Класс Student, наследующий User и с интерфейсом сортировки */
public class Student extends User implements Comparable<Student> {
    private long studentID;

    /** конструктор студента */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    /** метод получения ID-номера студента */
    public long getStudentID() {
        return studentID;
    }

    /** метод присвоения для ID-номера студента */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    /** метод перераспределения вывода студента */
    @Override
    public String toString() {
        return "Student{" + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", age=" + super.getAge() +
                ", studentID=" + studentID + "}";
    }

    /** метод для сортировки элементов класса Student */
    @Override
    public int compareTo(Student o) {

        System.out.println(super.getFirstName() + " - " + o.getFirstName());
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            }
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}
