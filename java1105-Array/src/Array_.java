public class Array_ {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        System.out.println(arr1[2]);
        int[] arr2 = new int[3];
        arr2 = arr1;
        arr2[2]=6;
        System.out.println(arr1[2]);
        System.out.println(arr2[2]);
    }
}
