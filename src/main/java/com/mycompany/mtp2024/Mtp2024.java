/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mtp2024;

import java.util.Scanner;

/**
 *
 * @author 20241070130005
 */
public class Mtp2024 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Número um: ");
        n1 = input.nextInt();
        System.out.print("\nNúmero dois: ");
        n2 = input.nextInt();
        
        System.out.print("\nSoma: " + (n1 + n2));
        
        input.close();
    }
}
