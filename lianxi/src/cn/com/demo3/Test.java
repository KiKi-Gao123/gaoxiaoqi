package cn.com.demo3;

public class Test {
    public static void main(String[] args) {

        //抽象类不能用new(抽象类不能实例化)
        //Animal an = new Animal();

        //利用多态，初始化抽象类
        Animal an = new Cat();
        an.eat();
        an.sleep();
    }
}
