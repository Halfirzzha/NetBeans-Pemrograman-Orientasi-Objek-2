/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.konversidata;

/**
 *
 * @author halfirzzha
 */
// Contoh konversi tipe data
public class KonversiData {
    public static void main(String[] args) {
        int a = 50;
        double b = 40.5;

        // Konversi dari int ke string
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        // Konversi dari string ke int
        int intA = Integer.parseInt(strA);

        // Konversi dari string ke double
        double doubleB = Double.parseDouble(strB);

        System.out.println("Nilai intA: " + intA);
        System.out.println("Nilai doubleB: " + doubleB);
    }
}

