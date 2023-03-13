import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar el tamaño del arreglo al usuario
        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        // Crear el arreglo
        int[] arr = new int[size];

        // Solicitar los valores para llenar el arreglo
        System.out.println("Ingrese los valores para llenar el arreglo:");
        for (int i = 0; i < size; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arr[i] = entrada.nextInt();
        }

        // Solicitar el número de movimientos
        System.out.print("Ingrese el numero de movimientos: ");
        int numMovimientos = entrada.nextInt();

        // Realizar los movimientos
        for (int i = 0; i < numMovimientos; i++) {
            int temp = arr[0];
            for (int j = 0; j < size-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[size-1] = temp;
        }

        // Imprimir el arreglo resultante
        System.out.print("El arreglo resultante es: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
