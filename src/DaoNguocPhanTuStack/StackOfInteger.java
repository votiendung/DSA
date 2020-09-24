package DaoNguocPhanTuStack;

import java.util.Scanner;

public class StackOfInteger {
    public static void main(String[] args) {
//        daoNguocINT();
        MyGenericStack<String> stack = new MyGenericStack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String string = sc.nextLine();
        String[] arr1 = string.split(" ");
        String[] arr2 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
             stack.push(arr1[i]);
        }
        for (int i = 0; i< arr1.length;i++) {
            arr2[i] = stack.pop();
        }

        for (int i =0; i< arr1.length; i++) {
            System.out.print(arr2[i]+ " ");
        }

    }

    private static void daoNguocINT() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n phan tu");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++) {
            System.out.println("nhap num");
            int num = sc.nextInt();
            arr[i] = num;
             stack.push(num);
        }

        for (int i =0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }


        for (int i = 0; i<n; i++) {

           arr[i] = stack.pop();
        }
        for (int i =0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
        }


}
