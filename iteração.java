/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.ArrayList;

/**
 *
 * @author 70463550617
 */
public class iteração {
    public static void main(String[] args) {
         ArrayList<String>minhaLista = new ArrayList<String>();
        minhaLista.add ("maca");
        minhaLista.add ("banana");
        minhaLista.add ("laranja");
        for (String frutas: minhaLista){
            System.out.println(frutas);
        }
    }
}
