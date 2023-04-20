package CRUD;
import Vista.MenuEntidades;
import java.util.ArrayList;
import java.util.Scanner;

public class Crear {
   
    
    public static String[] cabecera;
    public static String[] cabeceraCliente = {"id_cliente","nombre", "apellido", "fecha_nacimiento", "documento", "telefono", "direccion", "edad"};
    public static String[] cabeceraEmpresa = {"id_empresa","nombre", "nit", "correo", "telefono", "direccion"};
    public static String[] cabeceraProducto = {"id_producto","nombre", "precio", "marca"};
    public static String[] cabeceraCaja = {"id_caja"};
    public static ArrayList<String> lista = new ArrayList<>();
    public static int nFilas, nColumnas;
    public static Object[][] Cliente;
    private static Scanner numeros, cadena;
    static int tipoEntidad = MenuEntidades.entidad;
    
    
    public static void Ingresar() {
        
        switch (tipoEntidad) { // verifico que entidad se esta trabajando
            case 1 -> cabecera = cabeceraCliente;
            case 2 -> cabecera = cabeceraEmpresa;
            case 3 -> cabecera = cabeceraProducto;
            case 4 -> cabecera = cabeceraCaja;
            default -> {
            }
        }
        
        
        numeros = new Scanner(System.in);
        cadena = new Scanner(System.in);
        for (int i = 0; i < cabecera.length; i++) { //Alimento la lista con los datos de la cabecera
            lista.add(cabecera[i]);
        }
        
        nColumnas = cabecera.length; // doy valor a las columnas
        System.out.println("Ingrese el Numero de Registros: ");
        nFilas = numeros.nextInt(); // doy valor a las filas
        Cliente = new Object[nFilas][nColumnas]; // instancio la matriz con los valores de las filas y las columnas
        
        for (int i = 0; i < Cliente.length; i++) { // Recorro el numero de filas
            for (int j = 0; j < Cliente[i].length; j++) { //Recorro el numero de columnas
                System.out.println(lista.get(j) + ": "); // imprime el valor de la cabecera para saber que valor tenemos que introducir
                Cliente[i][j] = cadena.nextLine(); //Inserto los datos en la pocision de la matriz que estamos recorriendo
            }
            
        }
    }
    
}
