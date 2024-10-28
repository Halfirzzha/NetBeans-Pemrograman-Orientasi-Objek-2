/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.contohvariabel;

/**
 *
 * @author halfirzzha
 */
// Contoh penggunaan variabel lokal dan member dalam Java
public class ContohVariabel {
    static int a; // member variable
    static boolean b; // member variable
    static float c; // member variable

    public static void main(String[] args) {
        int x = 5; // local variable
        boolean y = true; // local variable
        float z = 23.5f; // local variable

        System.out.println("Variabel Lokal:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("\nVariabel Member:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

