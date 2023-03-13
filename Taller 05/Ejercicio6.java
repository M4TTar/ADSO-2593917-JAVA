import java.util.Scanner;

public class Ejercicio6 {
    static char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static boolean hayGanador() {
        // Revisamos las filas
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] == tablero[fila][1] && tablero[fila][1] == tablero[fila][2] && tablero[fila][0] != ' ') {
                return true;
            }
        }

        // Revisamos las columnas
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] == tablero[1][columna] && tablero[1][columna] == tablero[2][columna] && tablero[0][columna] != ' ') {
                return true;
            }
        }

        // Revisamos las diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return true;
        }

        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return true;
        }

        return false;
    }

    static void imprimirTablero() {
        System.out.println("-------------");
        for (int fila = 0; fila < 3; fila++) {
            System.out.print("| ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(tablero[fila][columna] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos a Tres en Linea");

        System.out.print("Ingrese el nombre del primer jugador: ");
        String jugador1 = scanner.nextLine();

        System.out.print("Ingrese el nombre del segundo jugador: ");
        String jugador2 = scanner.nextLine();

        boolean jugando = true;
        boolean turnoJugador1 = true;

        while (jugando) {
            imprimirTablero();

            String jugadorActual = turnoJugador1 ? jugador1 : jugador2;
            char simboloJugadorActual = turnoJugador1 ? 'X' : 'O';

            System.out.print("Turno de " + jugadorActual + ". Ingrese una posicion (1-9): ");
            int posicion = scanner.nextInt();

            int fila = (posicion - 1) / 3;
            int columna = (posicion - 1) % 3;

            if (tablero[fila][columna] != ' ') {
                System.out.println("La posicion ya esta ocupada. Intente de nuevo.");
            } else {
                tablero[fila][columna] = simboloJugadorActual;
            }
        }
    }
}