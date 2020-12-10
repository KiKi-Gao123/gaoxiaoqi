package cn.com.demo5;

public class mouse implements A,B,C,USB{
    @Override
    public void open(){
        System.out.println("连接鼠标");
    }
}
