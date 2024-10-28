/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.incrementdecrement;

/**
 *
 * @author halfirzzha
 */
// Contoh penggunaan operator increment dan decrement
public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Nilai awal i: " + i);

        System.out.println("Pre-increment (++i): " + ++i);
        System.out.println("Post-increment (i++): " + i++);
        System.out.println("Nilai i setelah post-increment: " + i);

        System.out.println("Pre-decrement (--i): " + --i);
        System.out.println("Post-decrement (i--): " + i--);
        System.out.println("Nilai i setelah post-decrement: " + i);
    }
}
