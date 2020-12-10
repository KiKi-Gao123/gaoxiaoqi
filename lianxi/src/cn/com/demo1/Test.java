package cn.com.demo1;
//多态的实现：
/*
要有继承关系
要有方法重写
父类引用指向子类对象是is a 的关系
 */
//多态的弊端：父类引用不能使用子类的特有成员
public class Test {
    public static void main(String[] args) {
        //通过多态创建对象，调用子类中的成员

        Animal an = new Dog();

        //调用eat方法
        an.eat();

        //调用watch方法
        //an.watch(); 子类的特有成员父类不能调用

    }
}
