package Vista;
import CRUD.Actualizar;
import CRUD.Crear;
import CRUD.Eliminar;
import CRUD.Leer;
import CRUD.Mostrar;
import java.io.IOException;
import java.util.Scanner;

public class MenuCrud {
    
    public static char opx;
    public static Object sql;
    
    public static void ejecutarMenu() throws IOException{
        do{ // Ejecuto mi menu de Crud para saber que acciones voy a tomar para la entidad elegida
            MenuCrud.Menu(opx);
        }while(opx != 'q' || opx != 'Q');
    }

    public static int Menu(char opc)throws IOException{
        
        Scanner input = new Scanner(System.in);
        System.out.print("""
                           1 Para Ingresar Datos
                           2 Para Modificar Datos
                           3 Para Elmiminar Datos
                           4 Para Consultar Datos
                           5 Para Mostrar Datos
                           Q Para Cerrar el Programa
                           Seleccione la Accion que desee hacer: """);
        char op = input.next().charAt(0);
        
        switch (op) { // abre la accion del crud que el usuario escogio
            case '1' -> Crear.Ingresar();
            case '2' -> Actualizar.Modificar();
            case '3' -> Eliminar.eliminarRegistro();
            case '4' -> Leer.Buscar(sql);
            case '5' -> Mostrar.mostrarDatos();
            case 'Q', 'q' -> {    
                System.out.print("Digite 1 Para Salir 2 Para Cancelar: ");
                opx = input.next().charAt(0);
                if (opx == '1') {
                    System.out.println("Hasta la Proximaaaaaa");
                    System.exit(0);
                }else if (opx == '2') {
                    System.out.println("Continua En el Sitema");
                }
            }
        }
        return opc;
    }
}
