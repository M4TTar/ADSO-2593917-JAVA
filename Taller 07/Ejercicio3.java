import java.util.Scanner;
import java.util.Random;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        Random random = new Random();

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(100);
        }

        // Imprimir el arreglo desordenado
        System.out.println("Arreglo desordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // Ordenar el arreglo utilizando el método de Burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}