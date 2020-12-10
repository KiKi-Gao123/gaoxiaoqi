package cn.com.gq4;

public class Child extends Parent{
    String sex;
    //设置性别
    public void setSex(String sex){
        this.sex=sex;
    }

    //获取性别
    public String getSex(){
        return sex;
    }
}
