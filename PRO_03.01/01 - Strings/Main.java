package com.company;

public class Main {

    public static void main(String[] args) {
        String x = "  Dnes je krasny den    ";
        String[] array = x.split(" "); //Oddeli text vzdy tam, kde je mezera
        for (String i:
             array) {
            System.out.println(i);
        }
        x = x.toUpperCase(); //text cely velkym
        System.out.println(x);
        x = x.toLowerCase(); //text cely malym
        System.out.println(x);
        x = x.trim(); //smaze mezery na zacatku a na konci
        System.out.println(x);
        char[] letters = x.toCharArray(); //prevede text na pole znaku
        for (char y:
             letters) {
            System.out.print(y + " ");
        }
        /*
        x.equals("text"); - true v pripade, ze texty jsou totozne
        x.equalsIgnoreCase("text"); - true v pripade, ze text je stejny bez ohledu na velka pismena
        x.contains("text"); - true v pripade, ze string X obsahuje "text"
         */
    }
}
