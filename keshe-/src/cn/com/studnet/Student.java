package cn.com.studnet;

public class Student {
    public String stuID;
    public String stuName;
    public String sex;
    public int age;
    public String phone;

    //全参构造
    public Student(String ID,String name,String s,int a,String ph){
        stuID = ID;
        stuName = name;
        sex = s;
        age = a;
        phone = ph;
    }
}
