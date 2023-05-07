package StudentDomen;

import java.util.Iterator;
import java.util.List;

/** класс для итерирования класса Student c интерфейсом Iterator */
public class StudentGroupIterator implements Iterator<Student> {
    private int counter; // счетчик
    private final List<Student> students; // итерируемы список студентов

    /** конструктор */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /** метод, по которому узнаем дошли ли до конца списка */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    /** метод получение элемента(студента) из списка */
    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }

        return students.get(counter++);
    }

}
