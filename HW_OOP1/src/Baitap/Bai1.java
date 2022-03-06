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

    public static boolean binarySearch(int[] arr, int x, int n) {

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x)
                return true;
            else if (arr[mid] < x)
                left = mid + 1;
            else right = mid - 1;
        }
        return false;
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

        System.out.println("nhap so can tim: ");
        int x = sc.nextInt();
        if (binarySearch(a, x,n)) {
            System.out.println("phan tu trong mang");
        } else {
            System.out.println("khong tim thay phan tu");
        }
    }
}
