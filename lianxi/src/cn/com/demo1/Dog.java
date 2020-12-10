package cn.com.demo1;

//继承关系

public class Dog extends Animal{

    //子类，狗类


    @Override
    //方法重写

    public void eat(){

        System.out.println("狗吃骨头");
    }

    //狗类独有成员
    public void watch(){
        System.out.println("狗会看家");
    }

}
