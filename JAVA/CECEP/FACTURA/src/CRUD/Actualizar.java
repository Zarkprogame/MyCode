package CRUD;
import Vista.MenuEntidades;
import java.util.Scanner;

public class Actualizar {
    
    public static int registros;
    public static Object sql;
    static int tipoEntidad = MenuEntidades.entidad;
    
    public static void Modificar(){
        
        String cliente = "[0-IdCliente] [1-Nombre] [2-Apellido] [3-FechaNacimiento] [4-Documento] [5-Telefono] [6-Direccion] [7-Edad]";
        String empresa = "[0-IdEmpresa] [1-Nombre] [2-Nit] [3-Correo] [4-Telefono] [5-Direccion]";
        String producto = "[0-IdProducto] [1-Nombre] [2-Precio] [3-Marca]";
        String caja = "[0-IdCaja]";
        String mostrar = "";
        Scanner input = new Scanner(System.in);
        registros = Crear.nFilas;
        String acumulador = "";
        System.out.println("Ingrese la Identificacion: ");
        sql = input.nextLine();
        boolean encuentra = false;
        int pos = 0;
        int columna;
        
        if (registros == 0) { //Verificamos si hay datos en el registro
            System.out.println("No hay Datos");
        }
        
        switch (tipoEntidad) { // verificamos la entidad que vamos a trabajar
            case 1 -> mostrar = cliente;
            case 2 -> mostrar = empresa;
            case 3 -> mostrar = producto;
            case 4 -> mostrar = caja;
        }
        
        while(!encuentra && pos < registros){ // Mientras encuentre un dato y la pocision sea menor a los registros
            if (sql.equals(Crear.Cliente[pos][0])) { // si el valor que estamos buscando es igual al valor que estamos recorriendo
                encuentra = true; // encuenra va a ser verdadero y saldra de este ciclo
            }else{ // sino cambiamos la pocision y seguimos buscando el dato
                pos++;
            }
        }
        
        
        if (pos < registros) { //si la pocision es menor al registro
            System.out.println("Digite Valor: " + mostrar); // damos a elegir que dato de la cabecera queremos cambiar
            acumulador = input.nextLine();
            columna = Integer.parseInt(acumulador); //tomamos el dato de la columna a la que queremos cambiar el valor
            modificarDatos(pos, columna); // le damos los paremetros al metodo para que cambie el valor en la pocision de la matriz deseada
        }
        
    }
    
    public static void modificarDatos(int filas, int columnas){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite su " + Crear.cabecera[columnas] + ": ");
        String valor = input.nextLine(); //tomamos el valor nuevo que queremos cambiar
        Crear.Cliente[filas][columnas] = valor; // remplazamos el nuevo valor
    }
    
}
