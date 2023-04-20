package VISTA;
import CRUD.Crear;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    
    private static int opcion;
    private static int opcion2;
    
    public static void main(String[] args)throws IOException{
        do{
            entidades.Menu();
            do{
                
            Principal.Menu2(opcion2);   
            
            }while(opcion2 != 6);
            
        }while(opcion!= 5);
        
    }
    
    public static int Menu2(int opcion2)throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("""
                           1 Para Ingresar Datos
                           2 Para Modificar Datos
                           3 Para Elmiminar Datos
                           4 Para Consultar Datos
                           5 Para Mostrar Datos
                           6 Para Salir
                           Seleccione la Accion que desee hacer: """);
        int eleccion = input.nextInt();
        
        switch (eleccion) {
            case 1:
                Crear.Ingreso();
//            case 2 -> ;
//            case 3 -> ;
//            case 4 -> ;
//            case 5 -> ;
            case 6:
                System.out.print("Digite 1 Para Salir 2 Para Cancelar: ");
                opcion = input.nextInt();
                if (opcion == 1) {
                    System.out.println("Hasta la Proximaaaaaaa");
                    System.exit(0);
                }else if (opcion == 2) {
                    System.out.println("Continua En el Sitema");
                }
        }
        return opcion2;
    }
}
