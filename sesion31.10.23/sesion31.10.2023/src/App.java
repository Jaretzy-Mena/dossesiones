import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        Pelicula endgame=new Pelicula();

    //  System.out.println("Nombre: "+ endgame.mostrarNombre());
    
        endgame.establecerNombre("Avengers: Endgame");
        endgame.establecerNombre("Endgame");
        endgame.establecerDuración(-125);
        endgame.setCalidad("4K");
        endgame.setClasificacion("PG-13");
        endgame.setGenero("Ciencia ficcón");

        System.out.println("Nombre: "+ endgame.mostrarNombre()+".");
        System.out.println("Duración: "+ endgame.mostrarDuracion()+" min.");
        System.out.println("Calidad: "+endgame.getCalidad()+".");
        System.out.println("Clasificación: "+endgame.getClasificacion()+".");
        System.out.println("Genero: "+endgame.getGenero()+".");
        
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

        Pelicula justiceleague= new Pelicula("justice League", 240, "Ciencia ficción", "8K", "R");
        System.out.println("Nombre: "+ justiceleague.mostrarNombre()+".");
        System.out.println("Duración: "+ justiceleague.mostrarDuracion()+" min.");
        System.out.println("Calidad: "+justiceleague.getCalidad()+".");
        System.out.println("Clasificación: "+justiceleague.getClasificacion()+".");
        System.out.println("Genero: "+justiceleague.getGenero()+".");
        
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

        Pelicula superman=new Pelicula();
        System.out.println("Nombre: "+ superman.mostrarNombre()+".");
        System.out.println("Duración: "+ superman.mostrarDuracion()+" min.");
        System.out.println("Calidad: "+superman.getCalidad()+".");
        System.out.println("Clasificación: "+superman.getClasificacion()+".");
        System.out.println("Genero: "+superman.getGenero()+".");

        System.out.println("--------------------------------------------------------------");

        System.out.println("¿Como se llama la película?");
        String nombre=lector.nextLine();
        superman.establecerNombre(nombre);

        System.out.println("¿Cuanto dura la pelicula?");
        int duracion=lector.nextInt();
        superman.establecerDuración(duracion);
        
        System.out.println("¿Que calidad tiene la pelicula?");
        String calidad=lector.nextLine();
        superman.setCalidad(calidad);

        System.out.println("¿Que clasificacion tiene la pelicula?");
        String clasificacion=lector.nextLine();
        superman.setClasificacion(clasificacion);

        System.out.println("¿Que genero es la pelicula?");
        String genero=lector.nextLine();
        superman.setGenero(genero);

        System.out.println("Nombre: "+ superman.mostrarNombre()+".");
        System.out.println("Duración: "+ superman.mostrarDuracion()+" min.");
        System.out.println("Calidad: "+superman.getCalidad()+".");
        System.out.println("Clasificación: "+superman.getClasificacion()+".");
        System.out.println("Genero: "+superman.getGenero()+".");

    }
}
