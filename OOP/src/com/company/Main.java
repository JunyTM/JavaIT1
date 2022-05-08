package com.company;


public class Main {
    public  static void  cong(Integer a) {
        a++;
    }

    public static void main(String[] args) {
	// write your code here
       A a = new A(1);
       for(int i = 0; i<10; i++) {
           cong(a.a);
           System.out.println(a.a);
       }
    }
}
