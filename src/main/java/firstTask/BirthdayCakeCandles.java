package main.java.firstTask;

import java.util.Arrays;

public class BirthdayCakeCandles {
    public void birthdayCakeCandels (int[] candlesCounts){
        int result=0;
        Arrays.sort(candlesCounts);
        for (int x: candlesCounts){
            if (candlesCounts[candlesCounts.length-1]==x){
                result++;
            }
        }
        System.out.println("Number of candels is "+ result);
    }
}
