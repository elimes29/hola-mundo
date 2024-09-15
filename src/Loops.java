import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaliizciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la película Matrix");
            nota = teclado.nextDouble();
            mediaEvaliizciones = mediaEvaliizciones + nota;
        }
        mediaEvaliizciones = mediaEvaliizciones/3;

        System.out.println("El promedio de las nota de la pelicula es: "+mediaEvaliizciones);
    }
}
