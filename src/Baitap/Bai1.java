package Baitap;

import java.util.Scanner;

public class Bai1 {
    public static void show(int[] a,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
    }
    public static void sort_(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("nhap mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        show(a, n);

        sort_(a, n);
        System.out.println("Sap xep mang: ");
        show(a,n);
    }
}
