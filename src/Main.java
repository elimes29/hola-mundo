public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido(a) a Screem Match!");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incuidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2+6.0+9.3)/3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja.
                La mejor película del fin del milenio.
                fué lanzada en:
                """ + fechaDeLanzamiento + """
                
                """+
                """
                obtuvo una nota promedio de 
                """ + media;
        System.out.println(sinopsis);

        int clasificacion = (int) (media);
        System.out.println(clasificacion);

    }
}