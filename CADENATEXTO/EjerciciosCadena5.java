import java.util.Scanner;
    public class EjerciciosCadena5 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese su nombre: ");
            String nombre = entrada.nextLine();

            String palabra = "ornitorrinco";

            int arreglo1 = new int [palabra.length()];

            System.out.print("Ingrese 1 para INICIAR juego o 2 para SALIR");
            int opcion = new entrada.nextInt();

            for (int i = 0; i <= palabra.length(); i++) {
                System.out.print(" _ ");
            }
            
        }
    }
