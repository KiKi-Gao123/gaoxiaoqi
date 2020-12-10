package cn.com.gq3;

public class StudentTest {
    public static void main(String[] args) {
        //需求:通过空参创建对象
        Student stu1 = new Student();
        stu1.setName("赵峰");
        stu1.setAge(19);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getName()+"的年龄是"+stu1.getAge()+"岁");
        System.out.println("=================");
        //需求：通过实参创建对象
        Student stu2 = new Student("高琪",20);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName()+"的年龄是"+stu2.getAge()+"岁");

    }
}
