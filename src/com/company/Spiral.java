package com.company;

import java.util.Arrays;

public class Spiral {
    public static int []spiral(int [][] a){
        int area = a.length * a[0].length;
        int[] a2 = new int[area];
        int x = 0;
        int small;//length of smaller side
        if(a.length<=a[0].length) small = a.length;
        else small = a[0].length;

        int count = 0;

        while (x<area && count <= small*2-1){
            int condition = count%4;
            if(condition == 0){
                for (int i = 0; i < a[0].length - (count+3)/4; i++){
                    a2[x] = a[(count-1)/2][i];
                    x++;
                }
                count++;
            }
            else if(condition == 1){
                for (int i = (count)/2; i < a[0].length - (count+4)/4 ; i++){
//                  a2[x] = a[i+1][a[0].length - (count+4)/4];
                    a2[x] = 1;
                    x++;
                }
                count++;
            }
            else if(condition == 2){
//                for (int i = 0; i < a[0].length - (count+3)/4; i++){
//                    a2[x] = a[(count-1)/2][i];
//                    x++;
//                }
                count++;
            }
            else if(condition == 3){
//                for (int i = (count+1)/2; i < a.length - condition*(count+4)/4; i++){
//                    a2[x] = a[i][(count-1)/2];
//                    x++;
//                }
                count++;
            }
        }
        return a2;
    }

    public static void main(String[] args) {
        int [][]a={
                {1,  2,  3,  4, 5},
                {6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        System.out.println(Arrays.toString(spiral(a)));

//        int [][] b = {
//                {1, 2,  3,  4},
//                {5, 6,  7,  8},
//                {9, 10, 11, 12}};
//        System.out.println(Arrays.toString(spiral(b)));
//
//        int [][] c = {{15},{38}, {26}};
//        System.out.println(Arrays.toString(spiral(c)));
//
//        int [][] d = {
//                {40, 25},
//                {17, 99},
//                {76, 53},
//                {88, 2}};
//        System.out.println(Arrays.toString(spiral(d)));
//
//        int [][] e = {{7, 3, 5, 2}};
//        System.out.println(Arrays.toString(spiral(e)));
    }
}

/*
[1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
[15, 38, 26]
[40, 25, 99, 53, 2, 88, 76, 17]
[7, 3, 5, 2]

 */