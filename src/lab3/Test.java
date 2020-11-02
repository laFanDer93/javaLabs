package lab3;

public class Test {
    public static void main(String[] args) {

        Student st1=new Student(3,"Волков Алексей Петрович");
        Student st2=new Student(5,"Сидорова Мария Анатольевна");

        Group group1 = new Group("Группа 1");

        Student st3 = new Student(2,"Королёв Алексей Сергеевич");
        Student st4 = new Student(1,"Громов Алексей Михайлович");
        Student st5 = new Student(4,"Гвоздева Алина Витальевна");

        Group group2 = new Group("Группа 1");

        st1.setGroup(group1);
        System.out.println(st1.getGroup());
        group1.addStudent(st2);
        for(Student s: group1.student){
            System.out.println(s.getFio());
        }


    }
}
