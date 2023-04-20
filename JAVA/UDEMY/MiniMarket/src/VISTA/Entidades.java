package VISTA;
import java.io.IOException;
import java.util.Scanner;

public class Entidades {
    
    private static int opcion;
    
    public static int menu(int entidad) throws IOException{
        entidad = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("""
                           1 Para Ingresar a la Entidad Cliente
                           2 Para Ingresar a la Entidad Empresa
                           3 Para Ingresar a la Entidad Producto
                           4 Para Ingresar a la Entidad Caja
                           Seleccione la Entidad a la que desea ingresar: """);
        int eleccion = input.nextInt();
        
        switch (eleccion) {
            case 1 -> entidad = 1;
            case 2 -> entidad = 2;
            case 3 -> entidad = 3;
            case 4 -> entidad = 4;
            case 5 -> {
                System.out.print("Digite 1 Para Salir 2 Para Cancelar: ");
                opcion = input.nextInt();
                if (opcion == 1) {
                    System.out.println("Hasta la Proximaaaaaaa");
                    System.exit(0);
                }else if (opcion == 2) {
                    System.out.println("Continua En el Sitema");
                }
            }
        }
        return entidad;
    }
    
}
