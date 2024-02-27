import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {

        List<Student> studentList =  new ArrayList<Student>();

        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));

        List<Teacher> teacherList =  new ArrayList<>();

        teacherList.add(new Teacher("Albus",201));
        teacherList.add(new Teacher("Severus",202));

        List<Person> personList = new ArrayList<>();
        personList.add(new Student("Albus",201));
        personList.add(new Student("Severus",202));
        personList.add(new Student("Albus",201));
        personList.add(new Teacher("Severus",202));
        personList.add(new Teacher("Albus",201));

        printInfo(studentList);
        printInfo2(teacherList);
        printInfo3(personList);


    }
    public static void  printInfo(List<Student> students){
        for (Student eachStudent : students) {
            System.out.println(eachStudent);
        }

    }
    public static <T extends Person>void  printInfo2(List<T> personList){
        for (T eachPerson : personList) {
            System.out.println(eachPerson );
        }

    }
    public static void  printInfo3(List<Person> personList){
        for (Person eachPerson : personList) {
            System.out.println(eachPerson);
        }

    }
}
