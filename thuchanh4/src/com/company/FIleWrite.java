package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FIleWrite {
    protected String fileName;

    public FIleWrite() {
        this.fileName = "dayso.txt";
    }

    public FIleWrite(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void createFile() {
        double arr[] = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        try {
            FIleWrite outFile = new FIleWrite("dayso.txt");
            for(double x : arr) {
                outFile.write(Double.toString(x * 100) + "\n");
            }
            outFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
