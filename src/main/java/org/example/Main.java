package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] d = new int[2][3];

        //First Row
        d[0][0] = 1;
        d[0][1] = 2;
        d[0][2] = 3;

        //Second Row
        d[1][0] = 4;
        d[1][1] = 5;
        d[1][2] = 6;

        for (int rowNum=0; rowNum<=1; rowNum++){
            System.out.println("Row " + rowNum);

            for (int colNum=0; colNum<=2; colNum++){
                System.out.println(d[rowNum][colNum]);
            }
        }
    }
}