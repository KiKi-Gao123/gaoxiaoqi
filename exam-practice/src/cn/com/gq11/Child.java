package cn.com.gq11;

public class Child extends Parent {
    public Child(int i, String niu) {
    }

    public Child() {
        
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.setName("gaoqi");
        System.out.println(c1.getName());
        
        Child c2 = new Child(20,"niu");
        System.out.println(c2.getName());
        System.out.println(c2.getSex());
    }
}
