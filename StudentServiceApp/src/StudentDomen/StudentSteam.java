package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentSteam и содержит список групп студентов с
 * методом Iterable
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroup; // список групп
    private String nameGroup; // название потока

    /** конструктор */
    public StudentSteam(List<StudentGroup> studentGroup, String nameGroup) {
        this.studentGroup = studentGroup;
        this.nameGroup = nameGroup;
    }

    /** метод получения списка групп студентов */
    public List<StudentGroup> getStudentSteam() {
        return studentGroup;
    }

    /** метод присвоения */
    public void setStudentSteam(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    /** метод получения имени потока */
    public String getNameGroup() {
        return nameGroup;
    }

    /** метод присовения импени потока */
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    /** метод перераспределения вывода в консоль */
    @Override
    public String toString() {
        return "Поток состоит из групп: " + studentGroup;
    }

    /** метод итерирования */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studentGroup.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }

                return studentGroup.get(index++);
            }

        };

    }

}
