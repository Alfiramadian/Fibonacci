/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

public class Jurnal {
     public static void main(String[] args) {
     
    int fibonacciDeret =10;
    int a=0;
    int b=1;
    for ( int i=1; i<= fibonacciDeret; i++)
    {
        System.out.println("Fibonacci :" +a);
        a=a+b;
        b=a-b;
    }
    }
 
}

