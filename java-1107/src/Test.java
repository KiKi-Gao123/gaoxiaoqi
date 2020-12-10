public class Test {
    //被final修饰的变量是常量 一旦赋值不能改变
    //常量命名时必须以大写命名
    final double PI = 3.14;

    //普通代码块
    {
        System.out.println("普通");
    }

    //静态代码块
    static {
        System.out.println("静态");
    }

}
