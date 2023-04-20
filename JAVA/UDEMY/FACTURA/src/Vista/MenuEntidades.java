package Vista;
import java.io.IOException;
import java.util.Scanner;

public class MenuEntidades {
    
    public static int entidad;
    private static int opcion;
    
    public static void main(String[] args)throws IOException{
        do{ //Ejecuto mi menu de Entidades para saber que entidad voy a trabajar
            MenuEntidades.menu(opcion);
        }while(opcion != 5);
    }
    
    public static int menu(int opcion) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("""
                           1 Para Ingresar a la Entidad Cliente
                           2 Para Ingresar a la Entidad Empresa
                           3 Para Ingresar a la Entidad Producto
                           4 Para Ingresar a la Entidad Caja
                           5 Para Cerrar el Programa
                           Seleccione la Entidad a la que desea ingresar: """);
        int eleccion = input.nextInt();
        
        switch (eleccion) { // Si Ejecuto cualquier entidad me mandara a ejecutar el Crud
            case 1:
                entidad = 1;
                MenuCrud.ejecutarMenu();
            case 2:
                entidad = 2;
                MenuCrud.ejecutarMenu();
            case 3:
                entidad = 3;
                MenuCrud.ejecutarMenu();
            case 4:
                entidad = 4;
                MenuCrud.ejecutarMenu();
            case 5:
                System.out.print("Digite 1 Para Salir 2 Para Cancelar: ");
                opcion = input.nextInt();
                if (opcion == 1) {
                    System.out.println("Hasta la Proximaaaaaaa");
                    System.exit(0);
                }else if (opcion == 2) {
                    System.out.println("Continua En el Sitema");
                }
                
        }
        return entidad;
    }
}
