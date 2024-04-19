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
            imprimirArreglo(array);
            
            System.out.println("Arreglo de medianas: ");
            // para calcular las medianas mitad/2 + 1
            // ir añadiendolas en un arraylist
            //sout
            System.out.println("Arreglo de medianas ordenado: ");
            //bubble sort   
            System.out.println("Mediana de las medianas: ");
            //calcular mitad/2 +1
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
        int temp;
        int pos = 0;
        int [] array = new int [matriz.length];
        //caso base
        for (int i = 0; i < pos-1; i++){
            for (int j = 0; j < pos-i-1; j++){
               if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;                    
                } 
            }                
        }
        //caso recursivo    
        return array; 
    }//fin método BubbleSort    
    
     public static void imprimirArreglo(int[] array){        
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");            
        }
        System.out.println("");
        }//fin método imprimirArreglo
        
}//clase
