/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtp2024;

/**
 *
 * @author 20241070130005
 */
public class Calculadora {
    
    Double numero1, numero2;
    
    Calculadora(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    Double somar() {
        return numero1 + numero2;
    }
    
    Double subtrair() {
        return numero1 - numero2;
    }
    
    Double multiplicar() {
        return numero1 * numero2;
    }
    
    Double dividir() {
        return numero1 / numero2;
    }
}
