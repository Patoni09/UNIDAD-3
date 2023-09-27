/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospar;

import java.util.Scanner;

/**
 *
 * @author ce182
 */
public class Numerospar {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresa un numero");
        int num1 = sc.nextInt();
        
        if (num1 % 2 == 0){
            System.out.println("el un numero ingresado es par");
        }else {
            System.out.println(" el un numero ingresado es  impar");
        }
       
    }
}
