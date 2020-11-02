package lab3;

import java.util.ArrayList;
import java.util.List;

public class Group {

    String title;// - название группы
    List<Student> student = new ArrayList<>();//- массив из ссылок на студентов
    Student head;//- ссылка на старосту (из членов группы)

    Group(String title) {
        this.title = title;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }

    public void setHead(Student student) {
        this.head = student;
    }

    public Student getStudent(String fio) {
        for (Student s : this.student) {
            if (s.getFio() == fio) {
                return s;
            }
        }
        return null;
    }

    public Student getStudent(int id) {
        for (Student s : this.student) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public double averageGroupMark() {
        double res = 0;
        for (Student s : student) {
            res += s.averageMark();
        }
        return res / student.size();
    }

    public List<Student> removeStudent(Student student) {
        this.student.remove(this.student.indexOf(student));
        return this.student;
    }
}