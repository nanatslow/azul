/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula17;

import java.util.Scanner;

/**
 *
 * @author 70463550617
 */
public class aula17 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um valor inteiro:");
        n = ler.nextInt();
        
        for(int i = 2; i < n; i+=2){
            System.out.println(i);
        }
    }
}
