// controlador
import java.util.Random;

public class Battleship
{
    private final int N = 5;
    private final int BARCOS = 3;
    private final int DISPAROS_MAX = 12;

    private final Tablero tablero;
    private final Consola vista;

    private final Random rnd = new Random();
    private int disparosUsados = 0;

    public Battleship()
    {
        this.tablero = new Tablero(this.N);
        this.vista = new Consola();
    }

    public void jugar() {
        // colocar barcos
        this.tablero.colocarBarcos(this.BARCOS, this.rnd);

        // instrucciones
        this.vista.mostrarBienvenida(this.N, this.BARCOS, this.DISPAROS_MAX);

        // disparos usados
        this.disparosUsados = 0;

        //  juego (ciclo while)
        while (disparosUsados < this.DISPAROS_MAX && !this.tablero.todoHundidos()) {
            this.vista.dibujarTablero(this.tablero);

            String entrada = this.vista.pedirEntrada("Disparo " + (this.disparosUsados + 1) + " de " + this.DISPAROS_MAX + ": ");
            entrada = entrada.trim().toUpperCase();

            if (entrada.equals("SALIR")) {
                this.vista.mostrarMensaje("Saliendo del juego... Gracias por jugar 👻");
                return;
            }

            if (entrada.equals("REVELAR")) {
                this.vista.dibujarTableroTrampa(this.tablero);
                continue;
            }

            int[] input = this.parsear(entrada);
            if (input == null) {
                this.vista.mostrarMensaje("Coordenada inválida...");
                continue;
            }
            
            // this.vista.mostrarMensaje(input[0] + "");
            // this.vista.mostrarMensaje(input[1] + "");
        }
    }

    private int[] parsear(String s) {
        if (s.length() < 2 || s.length() > 3) {
            return null;
        }

        char letra = s.charAt(0);
        if (letra < 'A' || letra >= 'A' + this.N) {
            return null;
        }

        String numero = s.substring(1);
        for (int i = 0; i < numero.length(); i++) {
            if (!Character.isDigit(numero.charAt(i))) {
                return null;
            }
        }

        int col = Integer.parseInt(numero);
        if (col < 1 || col > this.N) {
            return null;
        }

        int fila = letra - 'A';

        return new int[] {fila, col - 1};
    }
}