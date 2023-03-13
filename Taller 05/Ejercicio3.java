import java.util.Scanner;

    public class Ejercicio3 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese un nombre: ");
            String cadena = entrada.nextLine();

            String cadena_invertida="";
            for (int i = cadena.length()-1; i >= 0; i--) {
                cadena_invertida += cadena.charAt(i);
            }
            System.out.print(cadena_invertida);
        }
    }
