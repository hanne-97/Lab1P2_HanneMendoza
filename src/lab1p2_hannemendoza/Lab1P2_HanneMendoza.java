/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_hannemendoza;
import java.util.Scanner;
import java.util.Random;
/**
 * Fila 02 Asiento 3
 * @author Hanne
 */

public class Lab1P2_HanneMendoza {    
  static Scanner kore = new Scanner(System.in);  
  static Random rand = new Random();
  
    public static void main(String[] args) {
       
        System.out.println("Mediana de las medianas\n");
        System.out.println("Ingrese el tamaño de matriz deseado: ");    
        int tam = kore.nextInt();
        if(tam > 4 && tam%2 != 0){
            System.out.println("Matriz generada: ");
            int [][] mat = generarMatriz(tam);
            imprimirMatriz(mat);
            
            System.out.println("");
            
            System.out.println("Matriz ordenada:"); //forma recursiva bubble sort(ascendente)
            int [] array = BubbleSort(mat);
            
            System.out.println("Arreglo de medianas: ");
            
            System.out.println("Arreglo de medianas ordenado: ");
               
            System.out.println("Mediana de las medianas: ");
            
        }else{
            System.out.println("Número inválido debe ser mayor que 4 e impar");
        }
        
    }//main
    
    public static int[][] generarMatriz(int tam) {
        int [][] temp = new int [tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                temp [i][j] = rand.nextInt(10);
            }//for interno
        }//for externo
        return temp;
    }//fin método generarMatriz

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }//fin for
            System.out.println("");
        }//fin for
        }//fin método imprimirMatriz
    
    public static int [] BubbleSort(int [][] matriz){              
        int [] temp = new int [matriz.length];
        boolean cambiado = false;
        int n;
        int [] array;
        //caso base
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    cambiado = true;
                }
            }
        //caso recursivo    
        return 
    } 
    
}//clase
