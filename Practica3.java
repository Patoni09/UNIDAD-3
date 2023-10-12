

package com.mycompany.practica3;

import java.util.Scanner;


public class Practica3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
        int num1= 0, num2= 1 ,num3,n;
        System.out.println("Ingresa una cantidad de numeros para la serie");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(num1);
            num3 = num1 + num2;
            num1 = num2; 
            num2 = num3;
        }
    }
}
 