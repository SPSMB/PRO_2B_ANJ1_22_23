package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arr = {5, 8, 4, 3};
        String[] arr2 = {"text1", "text2"};
        System.out.println(arr[2]);

        Scanner sc = new Scanner(System.in);
        String[] names = {"Pepa", "Ondra", "Vavrinec"};
        /*int input = sc.nextInt();
        System.out.println(names[input]);*/

        for (String name : names) {
            System.out.println(name);
        }
        names[0] = "Rudolf";
        for (int x: arr) {
            System.out.print(x);
        }
        Arrays.sort(arr);
        System.out.println("");
        for (int x: arr) {
            System.out.print(x);
        }
        System.out.println("");
        int[][] arr3 = {{5,8,3,10},{7,4,5,8},{4,52,6,32}};
        System.out.println(arr3[2][3]);
    }
}
