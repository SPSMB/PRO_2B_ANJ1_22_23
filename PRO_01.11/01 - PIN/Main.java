package com.company;

import java.util.Scanner;

public class Main {

    /*
    Vytvořte program pro vstup do systému zabezpečený PIN kódem.
    Správný PIN nastavte přímo v kódu.
    Uživatel poté dostane tři šance na zadání správného PINu. 
    V případě, že ho zadá dobře, vypíšete do konzole vstupní uvítací hlášku.
    V případě, že ho nezadá dobře, vypíšete do konzole, že účet byl zablokován.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1547;
        int tries = 3;
        while (tries > 0) {
            System.out.println("Write your PIN code");
            int input = sc.nextInt();
            if (pin == input) {
                System.out.println("Welcome!");
                break;
            } else {
                tries--;
                System.out.println("Wrong PIN code! You have " + tries + " remaining attempts.");
                if (tries == 0) {
                    System.out.println("Your account has been blocked. F");
                }
            }
        }
    }
}
