package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("nhap cac pt:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bai1.sort(arr, n);
        bai1.show(arr, n);
        bai1.avg(arr, n);

        Point a1 = new Point(3, 4);
        Point b1 = new Point(4, 2);
        Point c1 = new Point(7,5);

        a1.distance(b1);
        Point.lineFunction(a1, b1);
        Point.checkPoint(a1, b1, c1);

        System.out.println("Bai 3 : ");

        Point3D a = new Point3D(-1,2,1);
        Point3D b = new Point3D(3,1,4);
        Point3D c = new Point3D(4,1,5);

        Vector vector = Point3D.PlaneEquation(a,b,c);


        System.out.println("Nhap diem X : ");
        double x = sc.nextDouble();
        System.out.println("Nhap diem Y : ");
        double y = sc.nextDouble();
        System.out.println("Nhap diem Z : ");
        double z = sc.nextDouble();

        Point3D point = new Point3D(x,y,z);

        System.out.println((Point3D.DiemTrongMatPhang(vector,point))?"Diem nam trong mat phang":"Diem khong nam trong mat phang");
    }
}
