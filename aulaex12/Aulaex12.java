/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaex12;

import java.util.Scanner;

/**
 * Linguagem de Programação
 * @author Natália Felipe
 */
public class Aulaex12 {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in); 
        int idade;
        
        System.out.println("Qual sua idade: ");
        idade = ler.nextInt(); 
        if (idade >= 18){
            System.out.println("Voce e maior de idade"); 
        }else{
            System.out.println("Voce nao e maior de idade");
        }
    }
    
}
