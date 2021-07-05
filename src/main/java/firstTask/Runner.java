package main.java.firstTask;

import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of children");
        Scanner scan=null;
        int[] candles;
        try {
            scan = new Scanner(System.in);
            int childCounts = scan.nextInt();
            candles = new int[childCounts];
            System.out.println("Enter the children`s age");
            for (int i = 0; i < candles.length; i++) {
                candles[i] = scan.nextInt();
            }
        }finally {
            if (scan!=null)
                scan.close();
        }
        BirthdayCakeCandles bcd=new BirthdayCakeCandles();
        bcd.birthdayCakeCandels(candles);
    }
}
