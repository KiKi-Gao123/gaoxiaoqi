package cn.com.gq4;

public class ChildTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.setName("小狗");
        System.out.println(c.getName());//调用父类的非私有方法
        c.setAge(2);
        System.out.println(c.getAge());//调用父类的方法
        c.setSex("女");
        System.out.println(c.getSex());
    }
}
