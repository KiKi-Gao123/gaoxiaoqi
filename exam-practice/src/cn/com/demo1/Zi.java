package cn.com.demo1;
//子类
public class Zi extends Fu{
    int num = 20;
    //构造方法
    public Zi(){
    }
//子类方法
    public void show(){
        int num = 10;
        System.out.println(num);        //10
        System.out.println(this.num);   //20
        System.out.println(super.num);  //30
    }
}
