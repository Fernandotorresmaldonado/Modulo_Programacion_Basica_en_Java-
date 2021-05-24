package Inicio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class numerosUsuarios {

    public static void main(String[] args) {
        // aplicación que pida 3 numeros al usuario y luego los muestre
        // de menor a mayor y de mayor a menor
        Scanner sc = new Scanner(System.in);
        int arreglo[], nEdades, aux;

        nEdades = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        arreglo = new int[nEdades];

        for (int i = 0; i < nEdades; i++) {
            System.out.println((i + 1) + "Digite un numero: ");
            arreglo[i] = sc.nextInt();

            //Metodo burbuja
            for (int i = 0; i < (nEdades - 1); i++) {
                for (int j = 0; i < (nEdades - 1); j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;

                        System.out.println("\nArreglo ordenado: ");
                        for (int i = 0; i < (nEdades - 1); i++) {
                            System.out.println(arreglo[i] + " - ");
                        }
                    }

                }

            }

        }

    }

}
