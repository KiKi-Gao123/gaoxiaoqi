public class Monkey {
    int age;
    //无参数无返回值(void)
    public void killnull(){
        System.out.println("悟空，去杀了牛魔王");
    }
    //无参数有返回值
    public int jieQ(){
        return 100;
    }
    //有参数(将方法外部的数据调用到方法内部使用)无返回值(void)
    public void huanqian(int money){
        System.out.println("还观音姐姐结了"+money+"元");
    }

    //有参数有返回值
    public  int buyIphone(int money,int price){
        return money/price;
    }

    //方法名必须和类名一样
    //无返回值也无需加void
    //系统会默认一个无参数的构造方法
    public Monkey(){

    }

    //有参数的构造方法
    public Monkey(int a){
        age=a;
    }

}
