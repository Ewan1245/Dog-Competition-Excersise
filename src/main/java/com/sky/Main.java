package com.sky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dog's final position:");
        int pos = sc.nextInt();
        String[] arr = getPositions(pos);
        for(String s : arr) {
            System.out.println(s);
        }
    }

    public static String[] getPositions(int dog_position) {
        String[] ret = new String[99];
        int count = 0;
        for(int i = 1; i <= 100; i++) {
            if(i == dog_position) continue;
            if((int)(i / 10) == 1) {
                //if in the teens everything has ..th
                ret[count++] = i + "th";
            } else {
                String append = switch (i % 10) {
                    case 1 -> "st";
                    case 2 -> "nd";
                    case 3 -> "rd";
                    default -> "th";
                };
                ret[count++] = i + append;
            }
        }
        return ret;
    }


}