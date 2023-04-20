package CRUD;
import VISTA.Entidades;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Zark
 */
public class Crear {
    
    public static void main(String[] args) {
        Crear.Ingreso();
    }
    
    public static String[] cabecera = {}
    public static String[] cabeceraCliente = {"id_cliente","nombre", "apellido", "fecha_nacimiento", "documento", "telefono", "direccion", "edad"};
    public static String[] cabeceraEmpresa = {"id_empresa","nombre", "nit", "correo", "telefono", "direccion"};
    public static String[] cabeceraProducto = {"id_producto","nombre", "precio", "marca"};
    public static String[] cabeceraCaja = {"id_caja"};
    public static ArrayList<String> lista = new ArrayList<>();
    public static final String titulo = "Registro de Clientes";
    public static int nFilas, nColumnas;
    public static Object[][] Cliente;
    private static Scanner numeros, cadena;
    
    switch(entidad){
        case 1:
            cabecera = cabeceraCliente;
        case 2:
            cabecera = cabeceraEmpresa;
        case 3:
            cabecera = cabeceraProducto;
        case 4:
            cabecera = cabeceraCaja;
    }
    
    public static void Ingreso(){
        numeros = new Scanner(System.in);
        cadena = new Scanner(System.in);
        for (int i = 0; i < cabecera.length; i++) {
            lista.add(cabecera[i]);
        }
        
        nColumnas = cabecera.length;
        System.out.println("Ingrese el Numero de Registros: ");
        nFilas = numeros.nextInt();
        Cliente = new Object[nFilas][nColumnas];
        
        for (int i = 0; i < Cliente.length; i++) {
            for (int j = 0; j < Cliente[i].length; j++) {
                System.out.println(lista.get(j) + ": ");
                Cliente[i][j] = cadena.nextLine();
            }
            
        }
    }
}
