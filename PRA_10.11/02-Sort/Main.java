package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    Vytvořte program, kde uživatel zadá 5 čísel, program tato čísla setřídí a následně vypíše.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Write " + (i+1) + ". number");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int x:
             array) {
            System.out.print(x + " ");
        }
    }
}
