package cn.com.gq;

import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        System.out.println(stu.getName());
        stu.setAge(-23);
        System.out.println(stu.getAge());
        stu.setAge(23);
        System.out.println(stu.getAge());
    }
}
