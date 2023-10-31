public class PC {
    //una clase vacia de nada sirve
    //Hay que agregarles (atributos) y comportamientos (metodos)
    //A las variables y metodos de una clase se les conoce como miembros de la clase
    //Para aplicar la encarcelacion (o ocultamiento de información) el modificador de acceso llamado private
    private String marca;
    private double cantidadRAM, velocidadRAM, almacenamiento, tamañoMonitor, velocidadCPU;
    private boolean tieneTeclado, tieneMouse, estaEncendida;
    private int CntidadDiscos;

    public PC(){//metodo constructor por defecto sin parametros
                //El proposito del metodo constructor es poder crear onjetos
        System.out.println("Se creo un objeto utilizando el constructor por defecto");
    }
}
