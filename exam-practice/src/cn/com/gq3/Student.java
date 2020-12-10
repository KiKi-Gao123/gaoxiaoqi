package cn.com.gq3;

public class Student {
    //成员变量，private一般修饰成员变量
    private String name;
    private int age;
    //构造方法
    //无参构造
    public Student(){

    }
    //全参构造
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //设置姓名
    public void setName(String name) {

        this.name = name;

    }
    //获取姓名
    public String getName() {
        return name;
    }
    //设置年龄
    public void setAge(int age) {

        this.age = age;
    }
    //获取年龄
    public int getAge() {

        return age;
    }
}
