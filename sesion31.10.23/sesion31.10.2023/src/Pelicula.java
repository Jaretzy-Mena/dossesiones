public class Pelicula {
    //Atributos
    private String nombre;
    private int duracion;
    private String genero, calidad, clasificacion;
    //Metodos contructores
    //Metodo constructor sin parametros
    public Pelicula(){
        this("No disponible", 0, "No disponible", "No disponible", "No disponible");
    }

    //Metodocostructor con todos los parametros
    public Pelicula( String nombre, int duracion, String genero, String calidad, String clasificacion){
        this.duracion = duracion;
        this.genero = genero;
        this.calidad = calidad;
        this.clasificacion= clasificacion;
        this.nombre=nombre;
    }
    //Metodos getters y setters
    //Los metodos getter son para mostrar los valores de los atributos
    public String mostrarNombre(){ //getNombre() para nosotros: mostrarNombre()
        return this.nombre;
    }
    public int mostrarDuracion(){ //getNombre() para nosotros: mostrarNombre()
        return this.duracion;
    }
    
    //
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCalidad() {
        return this.calidad;
    }
    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    public String getClasificacion() {
        return this.clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    //

    //Los metodos setters son para modificar los valores de los atributos
    public void establecerNombre(String nombre){//setNombre() para nosotros: EstablecerNombre()
        this.nombre = nombre;
    }
    public void establecerDuración(int duracion){//setNombre() para nosotros: EstablecerNombre()
        if(duracion<0){
            this.duracion=0;
        }else{
            this.duracion=duracion;
        }
    }
}
