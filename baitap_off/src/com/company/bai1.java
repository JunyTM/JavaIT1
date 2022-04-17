package com.company;

public class bai1 {
    public static void sort(int arr[], int n) {
        int tmp;
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < n - 1; j++) {
                tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
    public static void show(int arr[], int n) {
        System.out.println("In danh sach: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void avg(int arr[], int n) {
        System.out.println("Trung binh cong:");
        int sum = 0;
        for(int i = 0; i < n; i++) {
           sum += arr[i];
        }
        double avg = sum/n;
        System.out.println(avg);
    }
}
