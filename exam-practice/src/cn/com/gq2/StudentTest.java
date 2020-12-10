package cn.com.gq2;
/*构造方法：修饰符 构造方法名（参数列表）{
          //方法体}
*
* */

public class StudentTest {
    public static void main(String[] args) {
        //需求：定义一个名叫张三的学生，年龄为23
        Student stu = new Student();
        //格式一
        stu.setName("张三");
        stu.setAge(23);
        System.out.println(stu.getName()+"的年龄为"+stu.getAge()+"岁");
        System.out.println("=======================");
        //格式二:通过构造方法快速实现初始化
        Student stu1 = new Student("里斯",24);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getName()+"的年龄是"+stu1.getAge()+"岁");

    }
}
