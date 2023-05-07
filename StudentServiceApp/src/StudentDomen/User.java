package StudentDomen;

/**
 * класс User с данными (имя, фамилия и возраст) - общее для студентов, учителей
 * и служащих
 */
public class User {
    private String firstName;
    private String secondName;
    private int age;

    /** конструктор user */
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /** метод получения имени */
    public String getFirstName() {
        return firstName;
    }

    /** метод присвоения для имени */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** метод получения фамилии */
    public String getSecondName() {
        return secondName;
    }

    /** метод присвоения для фамилии */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /** метод получения возраста */
    public int getAge() {
        return age;
    }

    /** метод присвоения для возраста */
    public void setAge(int age) {
        this.age = age;
    }

    /** метод перераспределения вывода */
    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age + '}';
    }
}
