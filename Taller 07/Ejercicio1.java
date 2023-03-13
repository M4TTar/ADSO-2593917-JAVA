import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        int[] numerosimpares = new int[numero];

        for (int i = 0; i < numero; i++) {
            numerosimpares[i] = i * 2 + 1;
        }

        System.out.println("Los numeros impares son:");
        for (int i = 0; i < numero; i++) {
            System.out.print(numerosimpares[i] + " ");
        }
        System.out.println();
    }
}
