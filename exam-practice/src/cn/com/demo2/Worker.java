package cn.com.demo2;

public class Worker extends Person{
    public Worker(){
        //创建子类对象时，优先调用父类的构造方法
        //子类构造方法的第一行隐含语句super()  :用来初始化父类成员
        super("小赵");  //父类是有参构造，须手动调用super(参数)
        System.out.println("Worker的空参构造");

    }
}
