package com.ning.test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[][] weight = new int[6][];
        String[] pointsStr = {"v1","v2","v3","v4","v5"};
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < pointsStr.length;i++) {
            String[] valueStr = input.nextLine().split(" ");
            int[] values = new int[valueStr.length];
            for(int j = 0;j < valueStr.length;j++) {
                values[j] = Integer.parseInt(valueStr[j]);
            }
            weight[i] = values;
        }
        input.close();
        method(weight,pointsStr);
    }
    public static void method(int[][] weightArray,String[] strArray) {

    }
}
