package demo2;

public class TestStudent {
    public static void main(String[] args) {
        Student xiaohong = new Student();
        xiaohong.name = "小红";
        xiaohong.stu_num = "201902857";
        xiaohong.age = "20";

        //打印成员变量
        System.out.println(xiaohong.name);
        System.out.println(xiaohong.stu_num);
        System.out.println(xiaohong.age);

        xiaohong.stu_name();
        xiaohong.stu_num();
    }
}
