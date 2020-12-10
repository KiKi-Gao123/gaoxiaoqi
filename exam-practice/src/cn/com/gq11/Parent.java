package cn.com.gq11;

public class Parent {
    private String name;
    private int age;
    private String sex;

    public Parent(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public Parent(int age,String sex){
        this.age=age;
        this.sex=sex;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
}
