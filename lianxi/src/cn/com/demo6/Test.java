package cn.com.demo6;

public class Test {
    public static void main(String[] args) throws Exception{

       // show();
        //抛出异常

        //捕获异常
        try {
            show();

        }catch (Exception e){
            System.out.println("12345");
            return;
        }
        System.out.println("12345");


    }







    public static void show() throws Exception{
        int a = 10/0;
        System.out.println("a:"+a);
    }
}
