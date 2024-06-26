/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_hannemendoza;
import java.util.ArrayList;
import java.util.Collections;
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
            
            System.out.println("Matriz ordenada:");
            //int [] array = BubbleSort();
            //imprimirArreglo(array);
            
            //int mediana = (array.length/2)+1;            
            ArrayList medianas = new ArrayList();
            //medianas.add(mediana);            
            System.out.println("");
            
            System.out.println("Arreglo de medianas: ");
            
            System.out.println("");            
            System.out.println("Arreglo de medianas ordenado: ");
            Collections.sort(medianas);
            
            //bubble sort   
            System.out.println("");
            System.out.println("Mediana de las medianas: ");
            //mediana = (array.length/2)+1;
            //System.out.println(mediana);
            
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
            }
            System.out.println("");
        }
        }//fin método imprimirMatriz
      
    public static int[] BubbleSort(int[] arreglo) {
    int temp = arreglo.length;
    for (int i = 0; i < temp - 1; i++) {
        for (int j = 0; j < temp - i - 1; j++) {
            if (arreglo[j] > arreglo[j + 1]) {
                int temp2 = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }
        return arreglo;
    }

     public static void imprimirArreglo(int[] array){        
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");            
        }
        System.out.println("");
        }//fin método imprimirArreglo
        
     // dato curioso: sabian que con la inge Laura no vimos matrices
}//clase
// dato curioso: si algun dia quien cometer un homicidio y no quieren dejar rastro dejen el cuerpo en un lago y asi se descompone y no hay rastros