package com.company;

public class Main {

    public static void main(String[] args) {
        //bai1
     new DigitalWatch();
        //Bai2
        Bank acc = new Bank(8000);
        acc.display();
        Sender s = new Sender(acc);
        Receiver r = new Receiver(acc);
        s.t.start();
        r.t.start();
    }
}
