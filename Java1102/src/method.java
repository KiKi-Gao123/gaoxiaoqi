import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a,b: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean x = compare(num1,num2);
        System.out.println(x);

    }
    public static boolean compare(int a,int b){
        return a==b;
    }
}
