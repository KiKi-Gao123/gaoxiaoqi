public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        for (int i=0;i<5;i++){
            System.out.print(array1[i]  );
        }
        System.out.println();
        System.out.println("数组的长度为"+array1.length);
        System.out.println("数组的索引值最大为"+(array1.length-1));
        System.out.println("===========================================");
        int[] array2={1,2,3,4,5};
        for (int j=0;j<5;j++){
            System.out.print(array2[j]  );
        }
        System.out.println();
        System.out.println("============================================");
        int[] array3=new int[]{1,2,3,4,5};
        for (int k=0;k<5;k++){
            System.out.print(array3[k]  );
        }


    }
}
