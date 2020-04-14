package com.ning.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str1 = s.split(" ");
        int[] weights = new int[str1.length];
        for(int i = 0;i < str1.length;i++) {
            weights[i] = Integer.parseInt(str1[i]);
        }
        int maxLoad = Integer.parseInt(br.readLine());
        int count = countLeastBoat(weights,maxLoad);
        System.out.println(count);
    }
    public static int countLeastBoat(int[] weights,int maxLoad) {
        int sum = 0;
        for(int i = 0;i < weights.length;i++) {
            sum += weights[i];
        }
        int getBack = 0;
        if(sum / maxLoad > 0 && sum % maxLoad != 0) {
            getBack = sum / maxLoad + 1;
        }
        if(sum % maxLoad == 0) {
            getBack = sum / maxLoad;
        }
        if (sum /maxLoad == 0) {
            getBack = maxLoad;
        }
        return getBack;
    }
}
