/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex14;

import java.util.Scanner;

/**
 *
 * @author 70463550617
 */
public class aula14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int escolha;
        
         {
            System.out.println("Menu");
            System.out.println("1. Hamburguer ----- R$30,00 ");
            System.out.println("2. Cheeseburguer ----- R$35,50");
            System.out.println("3. Fritas ----- R$20,50");
            System.out.println("4. Refrigerante ----- R$10,00");
            System.out.println("5. Milkshake ----- R$30,00");
            System.out.println("Escolha uma opcao");
            
            escolha = ler.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("Voce escolheu o hamburguer");
                    break;
                case 2:
                    System.out.println("Voce escolheu o cheeseburguer");
                    break;
                case 3:
                    System.out.println("Voce escolheu as fritas");
                    break;
                case 4:
                    System.out.println("Voce esolheu refrigerante");
                    break;
                case 5: 
                    System.out.println("Voce escolheu o milkshake");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            
            
            }
          
            
        } 
    }


}
