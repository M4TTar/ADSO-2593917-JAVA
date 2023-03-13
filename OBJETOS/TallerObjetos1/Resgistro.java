import java.util.Scanner;

public class Resgistro {
    public static void main(String[] args) {
        
        Scanner letra = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        int opcion = 0;
        int pos_disponible = 0;
        Personas arreglo[] = new Personas [100];

        do {
            System.out.println("||------------------------------------------||");
            System.out.println("||----------------- PERSONAS ---------------||");
            System.out.println("||------------------------------------------||");
            System.out.println("||            Personas Resgistradas"+((pos_disponible<10)?"0":"")+pos_disponible+"||");
            System.out.println("||       1. Resgistrar Persona.             ||");
            System.out.println("||       2. Ver Lista de Personas           ||");
            System.out.println("||       3. Ordenar lista de Personas       ||");
            System.out.println("||       4. salir                           ||");
            System.out.println("||                                          ||");
            System.out.println("||                                          ||");
            System.out.println("||------------------------------------------||");
            System.out.println("||------------------------------------------||");
            opcion = numero.nextInt();

            if (opcion == 1) {

                System.out.println("||---- ingrese cedula----||");
                int cedula =numero.nextInt() ;
                System.out.println("||---- ingrese nombres----||");
                String nombres = letra.nextLine() ;
                System.out.println("||---- ingrese apellidos----||");
                String apellidos = letra.nextLine()  ;
                System.out.println("||---- ingrese direccion----||");
                String direccion = letra.nextLine() ;
                System.out.println("||---- ingrese telefono----||");                
                String telefono = letra.nextLine() ;
                System.out.println("||---- ingrese Email----||");                
                String email = letra.nextLine() ;
                System.out.println("||---- ingrese Altura----||");                
                int altura = numero.nextInt() ;
                Personas temporal = new Personas(cedula, nombres, apellidos, direccion, telefono, email, altura);
                boolean valido = true;
                for (int i = 0; i < pos_disponible; i++) {
                    if (temporal.getCedula() == arreglo[i].getCedula()) {
                        valido = false;
                        break;
                    }
                }
                if (valido) {
                    arreglo[pos_disponible] = temporal;
                    pos_disponible++;
                    System.out.println("...registrado con exito \n\n");
                }else{
                    System.out.println(".. el documento ya existe no se puede registrar \n\n");

                }
                arreglo[pos_disponible]=temporal;
                pos_disponible++;
                                
            }else if (opcion == 2) {
                for (int i = 0; i < arreglo.length; i++) {
                    if (arreglo[i]!=null) {
                        arreglo[i].imprimirResumen();
                    }
                }
            }else if (opcion == 3) {
                for (int i = 0; i < arreglo.length; i++) {
                    for (int j = 0; j < arreglo.length-1; j++) {
                        if (arreglo[j]!=null && arreglo[j+1]!=null) {
                            if (arreglo[j].getCedula() > arreglo[j+1].getCedula()) {
                                Personas aux = arreglo[j];
                                arreglo[j]=arreglo[j+1];
                                arreglo[j]=aux;
                            }
                        }
                    }
                }
            }else if (opcion == 4) {
                System.out.println("||...........SALIENDO........||");
            }else{
                System.out.println("||............ OPCION INVALIDA .................||");
            }
        } while (opcion!=4);
        
    }
}
