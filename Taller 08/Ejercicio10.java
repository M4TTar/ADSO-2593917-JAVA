import java.util.Scanner;
    public class Ejercicio10 {
        public static void main (String[] args){
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese el tamano del arreglo: ");
            int tam = entrada.nextInt();
            
            int [] arreglo1 = new int [tam];

            System.out.println("Ingrese los valores para llenar el arreglo: ");
            for (int i = 0; i < tam; i++) {
                int numeros = entrada.nextInt();
                arreglo1[i] = numeros;
            }

            System.out.print("Ingrese un valor para mover de derecha a izquierda el arreglo: ");
            int pos = entrada.nextInt();

            for (int i = 0; i < pos; i++) {
                int num_temporales = arreglo1[0];
                for (int j = 0; j < tam-1; j++){
                    arreglo1[j] = arreglo1[j+1];
                }
                arreglo1[tam-1] = num_temporales;
            }

            System.out.print("El arreglo final es: ");
            for (int i = 0; i < tam; i++){
                System.out.print(arreglo1[i] + " ");
            }
        }
    }