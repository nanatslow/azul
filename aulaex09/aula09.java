/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex09;

import java.util.Scanner;

/**
 * Disciplina: Linguagem de Programação
 * Data: 15/08/2023
 * @author Natália Felipe
 */
public class aula09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println ("Informe um valor inteiro:");
        int valor1 = (int) ler.nextFloat();
      
       System.out.println (valor1 > 0 && valor1 < 0);
       if (valor1 > 0){
           System.out.println ("POsitivo");
       }else if (valor1 < 0){
           System.out.println ("Negativo");
       }else {
         System.out.println ("Igual");
       }
    }
    
}
