import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PC miPc = new PC();//Creando un objeto de tipo PC
                            //Iniciando un objeto en la clase PC
                            //Se utiliza el metodo constructor de la clase
                            //El operador new reserva espacio en memoria para guardar
        PC mPc2 = new PC();
        Scanner lector=new Scanner(System.in);

        /*
        miPc.almacenamiento = 1024.00;
        miPc.CntidadDiscos= 1;
        miPc.cantidadRAM= 4096.00;
        miPc.estaEncendida= false;
        miPc.marca= "Imbecil" ;
        miPc.tamañoMonitor= 17.3;
        miPc.tieneMouse= true;
        miPc.tieneTeclado=true;
        miPc.velocidadCPU= 3.2;
        miPc.velocidadRAM=3600.00;

        System.out.println("Ingrese almacenamiento");
        miPc.almacenamiento = lector.nextDouble();
        
        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.CntidadDiscos= lector.nextInt();

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.cantidadRAM= 4096.00;

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.estaEncendida= false;

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.marca= "Imbecil" ;

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.tamañoMonitor= 17.3;

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.tieneMouse= true;

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.tieneTeclado=true;

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.velocidadCPU= 3.2;

        System.out.println("Ingrese cuantos dicos duros tiene");
        miPc.velocidadRAM=3600.00;
        */

        lector.close();
    }
}
