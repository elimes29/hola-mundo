import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int contador = 0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la película Matrix (para en -1)");
            nota = teclado.nextDouble();
            if (nota != -1){
                mediaEvaluaciones += nota;
                contador++;
            }
        }
        mediaEvaluaciones = mediaEvaluaciones/contador;
        System.out.println("El promedio de las nota de la pelicula es: "+mediaEvaluaciones);
    }
}

