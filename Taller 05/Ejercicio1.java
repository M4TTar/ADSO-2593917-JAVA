import java.util.Scanner;

    public class Ejercicio1 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            int cont=0;
            System.out.print("Ingrese su nombre: ");
            String cadena = entrada.nextLine();

            for (int i = 0; i < cadena.length(); i++) {
                System.out.println("<br> Letra en Possición "+i+" =>"+cadena.charAt(i));
                if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                    cont++;
                }else if (cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E') {
                    cont++;
                }else if (cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I') {
                    cont++;
                }else if (cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O') {
                    cont++;
                }else if (cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U') {
                    cont++;
                }
            }
            System.out.print("Prueba: "+cont);
        }
    }