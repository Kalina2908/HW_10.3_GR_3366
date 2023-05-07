package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentGroup (не является потомком) и содержит список всех студентов с
 * интерфейсом Iterable и методом Comparable
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students; // список студентов
    String nameGroup; // название группы

    /** конструктор для группы студентов */
    public StudentGroup(List<Student> students, String nameGroup) {
        this.students = students;
        this.nameGroup = nameGroup;
    }

    /** метод получения группы студентов */
    public List<Student> getStudents() {
        return students;
    }

    /** метод присвоения для группы студентов */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /** метод получения имени группы студентов */
    public String getNameGroup() {
        return nameGroup;
    }

    /** метод присвоения имени для группы студентов */
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    /** метод для класса StudentGroupIterator */
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    /** метод перераспрделения вывода в консоль */
    @Override
    public String toString() {
        return "Группа '" + nameGroup + "' состоит: " + students;
    }

    /** метод для сравнения элементов класса Student */
    @Override
    public int compareTo(StudentGroup o) {

        System.out.println(students.size() + " - " + o.students.size());
        if (students.size() == o.students.size()) {
            return 0;
        }
        if (students.size() < o.students.size()) {
            return -1;
        }
        return 1;
    }

    /** итератор для класса Student, если не использовать отдельный класс */

    /*
     * @Override
     * public Iterator<Student> iterator() {
     * return new Iterator<Student>(){
     * private int index = 0;
     * 
     * @Override
     * public boolean hasNext() {
     * return index<students.size();
     * }
     * 
     * @Override
     * public Student next() {
     * if(!hasNext())
     * {
     * return null;
     * }
     * 
     * return students.get(index++);
     * }
     * 
     * };
     * }
     */
}
