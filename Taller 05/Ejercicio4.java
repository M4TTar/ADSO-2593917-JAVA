import java.util.Scanner;    
    public class Ejercicio4 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese una palabra: ");
            String nombre = entrada.nextLine();

            String cadena_invertida="";

            for (int i = nombre.length()-1; i >= 0; i--) {
                cadena_invertida += nombre.charAt(i);
            }

            if (nombre.equalsIgnoreCase(cadena_invertida)) {
                System.out.print("Es un palindromo.");
            } else {
                System.out.print("No es un palindromo.");
            }
        }
    }