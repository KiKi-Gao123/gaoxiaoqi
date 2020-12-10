package cn.com.demo4;

public class Animial {

    //成员变量
    private String name;

    //设置姓名
    public void setName(String name){
        this.name=name;
    }

    //获取姓名
    public String getName(){
        return name;
    }

    //空参构造
    public Animial(){

    }
    //带参构造
    public Animial(String name){
        this.name=name;

    }

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
}
