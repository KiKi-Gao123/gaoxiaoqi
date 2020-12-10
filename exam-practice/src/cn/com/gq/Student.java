package cn.com.gq;

public class Student {
    //成员变量
    String name;
    private int age;

    //设置name的值
    public void setName(String name) {
        this.name = name;
    }


    //设置age的值
    public void setAge(int a) {
        if(age>200||age<=0){
            age=1;
        }else {
            age=a;
        }
    }

    //获取name的值
    public String  getName(){
        return name;
    }


    //获取age的值
    public int getAge(){
        return age;
    }
}
