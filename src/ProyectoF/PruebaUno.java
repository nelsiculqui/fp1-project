package ProyectoF;

import java.util.Scanner;

public class PruebaUno {

    public static void main(String[] args) {

        int n;

        System.out.println("Ingresa tamaño del arreglo");

        Scanner ing = new Scanner(System.in);

        n = ing.nextInt();

        int[] arr = new int[n];

        System.out.println("Ingresa elementos");

        for (int i=0; i<n; i++){
            arr[i] = ing.nextInt();
        }
        System.out.println("Estos son los elementos");

        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
