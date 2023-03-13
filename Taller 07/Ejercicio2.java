import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = scanner.nextInt();

        int[] primos = new int[n];

        int contador = 0;
        int numero = 2;

        while (contador < n) {
            if (num_primo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        System.out.println("Los numeros primos son:");
        for (int i = 0; i < n; i++) {
            System.out.print(primos[i] + " ");
        }
    }

    public static boolean num_primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}