import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        User u1 = new User("Иван", "Иванов", 25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long) 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
        Student s3 = new Student("Иван", "Петров", 22, (long) 121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long) 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);
        Student s7 = new Student("Павел", "Павлов", 23, (long) 106);
        Student s8 = new Student("Петр", "Сидоров", 25, (long) 107);
        Student s9 = new Student("Александр", "Александров", 24, (long) 108);
        Student s10 = new Student("Мария", "Маркова", 23, (long) 128);
        Student s11 = new Student("Марина", "Немаркова", 21, (long) 138);

        // создаем списки 3-х групп и заполняем студентами
        List<Student> listStudGroup1 = new ArrayList<Student>();
        List<Student> listStudGroup2 = new ArrayList<Student>();
        List<Student> listStudGroup3 = new ArrayList<Student>();
        listStudGroup2.add(s1);
        listStudGroup3.add(s2);
        listStudGroup1.add(s3);
        listStudGroup2.add(s4);
        listStudGroup2.add(s5);
        listStudGroup3.add(s6);
        listStudGroup2.add(s7);
        listStudGroup3.add(s8);
        listStudGroup2.add(s9);
        listStudGroup3.add(s10);
        listStudGroup1.add(s11);

        // Создаем три StudentGroup, которым назначаем имя и добавляем списки студентов
        StudentGroup group1 = new StudentGroup(listStudGroup1, "Group 1");
        StudentGroup group2 = new StudentGroup(listStudGroup2, "Group 2");
        StudentGroup group3 = new StudentGroup(listStudGroup3, "Group 3");

        // for(Student stud : group1){
        // System.out.println(stud);
        // }

        System.out.println("============= после сортировки =============");
        Collections.sort(group2.getStudents()); // сортируем студентов в группе 2

        for (Student stud : group2) {
            System.out.println(stud);
        }

        System.out.println("============= потоки и группы =============");

        // создаем список групп, который заполняем группами со студентами
        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group1);
        listGroup.add(group2);
        listGroup.add(group3);

        // Создаем поток, в который добавляем список групп со студентами и назначаем имя
        StudentSteam steam1 = new StudentSteam(listGroup, "Steam 1");

        for (StudentGroup steam : steam1) {
            System.out.println(steam);
        }

        System.out.println("============= после сортировки ГРУПП=============");
        Collections.sort(steam1.getStudentSteam()); // сортируем по количеству студентов в группе

        for (StudentGroup st : steam1) {
            System.out.println(st);
        }

    }
}
