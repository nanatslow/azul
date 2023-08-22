/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex13;

import java.util.Scanner;

/**
 *
 * @author 70463550617
 */
public class aula13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      int num;
      
        System.out.println("Informe um numero");
        num = ler.nextInt();
        
       num = num % 2;
       if (num != 0){
        System.out.println("O numero e impar");
            } else{
            System.out.println("O numero e par");
        }
    }
}
        
            
        
