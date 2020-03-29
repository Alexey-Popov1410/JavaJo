package Lesson10;
import java.util.*;


public class CollectionList1_2_3 {
    public static void main(String[] args) {

        List<Student> studentsList = createStudentsList();
        Students students = new Students(studentsList);

        /*Задание 1-2*/
        students.addRandomGrades();

        System.out.println("\nВсе оценки : ");
        students.printListRating();
        students.removeBadGrades();

        System.out.println("\nТолько положительные оценки : ");
        students.printListRating();

        System.out.println("\nМаксимальная оценка : " + students.getMaxGrade());

        /*Задание 3*/
        System.out.println("\nВывод учеников в обратном порядке  №1 : ");
        students.printListReverse1();
        System.out.println("\nВывод учеников в обратном порядке  №2 : ");
        students.printListReverse2();
    }

    public static List<Student> createStudentsList() {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Student1", 18));
        studentsList.add(new Student("Student2", 21));
        studentsList.add(new Student("Student3", 20));
        studentsList.add(new Student("Student4", 22));
        studentsList.add(new Student("Student5", 19));
        return studentsList;
    }
}