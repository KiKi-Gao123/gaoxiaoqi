package cn.com.demo5;

import cn.com.demo2.Mouse;

public class Test {
    public static void main(String[] args) {

        USB usb = (USB) new Mouse();
        usb.open();

    }
}
