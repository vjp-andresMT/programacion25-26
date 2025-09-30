/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioUno;

/**
 *
 * @author alumno
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos las variables: 
        int[] array = new int[10];

        rellenarArray(array);
        mostrarArray(array);
        sustituir(array);
        mostrarArray(array);
    }

    //metodo para rellenar el array con números aleatorios 
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
//            System.out.print(" "+array[i]);
        }
        System.out.println("Array rellenado correctamente.");
    }

    //metodo para sustituir los numero repetidos por 0
    public static void sustituir(int[] array) {
        int numRepetido = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numRepetido = array[i];
            }
        }
        System.out.println("Los numeros cambiados son: " + numRepetido);

    }
//Mostramos el array relleno con los numeros:
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Los numeros de la lista son :" + array[i]);
        }
    }

}
