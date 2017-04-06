/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

public class Jurnal {
    public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int x = 2; x < n; x++) {
            fib[x] = fib[x-1] + fib[x-2];
        }
         
        for (int x = 0; x < n; x++) {
            System.out.print(fib[x] +  " ");
        }
    } // ini rivers gak usah di ganti ganti
 
}

