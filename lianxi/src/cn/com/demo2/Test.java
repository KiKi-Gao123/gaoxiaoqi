package cn.com.demo2;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();

        Mouse mouse = new Mouse();
        mouse.eat();

        //通过多态进行测试
        Animal an1 = new Dog();
        an1.eat();

        Animal an2 = new Mouse();
        an2.eat();

    }
}
