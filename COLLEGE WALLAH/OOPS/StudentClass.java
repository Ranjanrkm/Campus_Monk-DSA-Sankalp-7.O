public class StudentClass{

    // creating a new data type
    public static class Student{
        String name;
        int rno;
        double percent;
    }

    public static class Car{
        String name;
        String type;
        int price;
    }

    public static void fun(Student x) {
        System.out.println(x.name);
        return;
    }

    public static void change(Student s) {
        s.name = "Mahato";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ranjan";
        s1.rno = 58;
        s1.percent = 92.5;

        Student s2 = new Student();
        s2.name = "Pragati";
        s2.percent = 97.2;
        s2.rno = 67;

        Car c1 = new Car();
        c1.name = "alto";
        c1.price = 400000;
        c1.type = "hatchback";

        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);

        System.out.println(c1.name);
        fun(s2);
    }
}