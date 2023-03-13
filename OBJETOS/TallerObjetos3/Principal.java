// import java.time.temporal.Temporal;
import java.util.Scanner;
    public class Principal {
        public static void main (String[] args){
            Scanner entrada_numero = new Scanner(System.in);
            Scanner entrada_texto = new Scanner(System.in);
            int opcion = 0;
            int n_opcion = 0;
            int pos_disponible = 0;
            Clientes arreglo [] = new Clientes [10];

            do{
                System.out.println("|| ----------------------------------- ||");
                System.out.println("|| -----------PERSONAS---------------- ||");
                System.out.println("|| ----------------------------------- ||");
                System.out.println("||    Personas Registradas: "+pos_disponible+"          ||");
                System.out.println("||                                     ||");
                System.out.println("|| 1. Registrar Cliente.               ||");
                System.out.println("|| 2. Ver Clientes Registrados.        ||");
                System.out.println("|| 3. Modificar Informacion Cliente.   ||");
                System.out.println("|| 4. Ver informacion Cliente.         ||");
                System.out.println("|| 5. Eliminar Cliente.                ||");
                System.out.println("|| 6. Salir.                           ||");
                System.out.println("|| ----------------------------------- ||");
                System.out.print("|| => Ingrese una opcion: ");
                opcion = entrada_numero.nextInt();

                if (opcion == 1) {
                    System.out.print(" Ingrese su documento: ");
                    long cedula = entrada_numero.nextLong();

                    System.out.print(" Ingrese los nombres: ");
                    String nombres = entrada_texto.nextLine();
                    
                    System.out.print(" Ingrese los apellidos: ");
                    String apellidos = entrada_texto.nextLine();

                    System.out.print(" Ingrese el telefono: ");
                    long telefono = entrada_texto.nextLong();

                    Clientes temporal = new Clientes(cedula, nombres, apellidos, telefono);

                    boolean valido = true;
                    for (int i = 0; i < pos_disponible; i++) {
                        if (temporal.getCedula() == arreglo[i].getCedula()) {
                            valido = false;
                            System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
                            break;
                        }
                    }

                    if (valido) {
                        arreglo[pos_disponible] = temporal;
                        pos_disponible++;
                        System.out.println("||===> REGISTRADO CON EXITO \n\n");
                    }else{
                        System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
                    }
                    arreglo[pos_disponible] = temporal;

                }else if (opcion == 2) {
                    for (int i = 0; i < arreglo.length; i++) {
                        if (arreglo[i] != null) {
                            arreglo[i].mostrarDatosPersonales();
                        }
                    }
                    System.out.println("\n\n");
                }else if (opcion == 3) {
                    for (int i = 0; i < arreglo.length; i++) {
                        arreglo[i].mostrarDatosPersonales();
                    }

                    System.out.print("Ingrese el documento para cambiar");
                    long n_cedula = entrada_numero.nextLong();
                    for (int i = 0; i < pos_disponible; i++) {
                        if (n_cedula == arreglo[i].getCedula()) {
                            do {
                                System.out.println("|| Ingrese que atributo o dato desea modificar:");
                                System.out.println("|| Escriba 1: Si desea modificar el Documento. ");
                                System.out.println("|| Escriba 2: Si desea modificar los Nombres.  ");
                                System.out.println("|| Escriba 3: Si desea modificar los Apellidos.");
                                System.out.println("|| Escriba 4: Si desea modificar el telefono.  ");
                                System.out.println("|| Escriba 5: Para salir.");
                                System.out.print(" => Ingrese una opcion: ");
                                n_opcion = entrada_numero.nextInt();

                                if (n_opcion == 1) {
                                    System.out.print("Ingrese el nuevo Documento.");
                                    long n_documento = entrada_numero.nextLong();
                                    arreglo[i].setCedula(n_documento);
                                }else if (n_opcion == 2) {
                                    System.out.print("Ingrese los nuevos Nombres.");
                                    String n_nombres = entrada_texto.nextLine();
                                    arreglo[i].setNombres(n_nombres);
                                }else if (n_opcion == 3) {
                                    System.out.print("Ingrese los nuevos Apellidos.");
                                    String n_apellidos = entrada_texto.nextLine();
                                    arreglo[i].setApellidos(n_apellidos);
                                }else if (n_opcion == 4) {
                                    System.out.print("Ingrese el nuevo Telefono.");
                                    long n_telefono = entrada_numero.nextLong();
                                    arreglo[i].setTelefono(n_telefono);
                                }else {
                                    System.out.println("|| ===================================== ||");
                                    System.out.println("|| =========== OPCION INVALIDA ========= ||");
                                    System.out.println("|| ===================================== ||");
                                }
                            } while (n_opcion != 5);
                        }
                    }
                }else if (opcion == 4) {
                    
                }else if (opcion == 5) {
                    
                }else if (opcion == 6) {
                    System.out.println("|| ============= SALIENDO ============== ||");
                }else{
                    System.out.println("|| ===================================== ||");
                    System.out.println("|| =========== OPCION INVALIDA ========= ||");
                    System.out.println("|| ===================================== ||");
                }

            }while (opcion != 6);
            
        }
    }


    // for (int j = 0; j < arreglo.length; j++) {
    //     if (arreglo[j] != null && arreglo[j+1] != null) {
    //         if (arreglo[j].getNombres().compareToIgnoreCase(arreglo[j+1].getNombres()) > 0 )  {
    //             Clientes aux = arreglo[j];
    //             arreglo[j] = arreglo[j+1];
    //             arreglo[j+1] = aux;
    //         }
    //     }
    // }