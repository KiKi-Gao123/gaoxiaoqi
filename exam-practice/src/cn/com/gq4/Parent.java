package cn.com.gq4;

public class Parent {
    //无参构造方法
    public Parent(){

    }
    private String name;
    private int age;
    //设置姓名
    public void setName(String name){
        this.name=name;
    }

    //获取姓名
    public String getName(){
        return name;
    }

    //设置年龄

    public void setAge(int age) {
        this.age = age;
    }
    //获取年龄
    public int getAge(){
        return age;
    }

}
