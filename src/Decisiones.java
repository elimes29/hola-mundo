public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incuidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //Validación de año de película
        if(fechaDeLanzamiento >= 2022){
            System.out.println("Películas más populares");
        }else {
            System.out.println("Película retro que aún vale la pena ver");
        }

        //Validación de planes para ver película
        if (incuidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Película no disponible para su plan actual");
        }
    }


}
