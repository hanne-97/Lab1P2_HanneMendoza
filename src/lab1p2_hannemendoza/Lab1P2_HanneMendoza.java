/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_hannemendoza;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Hanne
 */

public class Lab1P2_HanneMendoza {    
  static Scanner kore = new Scanner(System.in);  
  static Random rand = new Random();
  
    public static void main(String[] args) {
       
        System.out.println("Mediana de las medianas\n");
        System.out.println("Ingrese el tamaño de matriz deseado: ");
        int tam = kore.nextInt();
        System.out.println("Matriz generada: ");
        int [][] mat = generarMatriz(tam);
        imprimirMatriz(mat);
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
    }//main
    
    public static int[][] generarMatriz(int tam) {
        int [][] temp = new int [tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                temp [i][j] = rand.nextInt(10);
            }//for interno
        }//for externo
        return temp;
    }//fin método 

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }//fin for
            System.out.println("");
        }//fin for
        }//fin método

    
}//clase
