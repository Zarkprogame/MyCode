package CRUD;

import Vista.MenuEntidades;
import java.util.Scanner;

public class Leer {
    
    public static Object sql;
    static int tipoEntidad = MenuEntidades.entidad;
    public static int registros;
    
    public static Object Buscar(Object sql){
        Scanner input = new Scanner(System.in);
        String cliente = "Cliente";
        String empresa = "Empresa";
        String producto = "Producto";
        String caja = "Caja";
        String entidad = "";
        registros = Crear.nFilas;
        
        if (registros == 0) { // En caso de no haber registros imprimir que no hay y salir
            System.out.println("No hay Datos aun.");
            System.exit(0);
        }
        
        switch (tipoEntidad) { //Verifico la entidad que estamos trabajando
            case 1 -> entidad = cliente;
            case 2 -> entidad = empresa;
            case 3 -> entidad = producto;
            case 4 -> entidad = caja;
        }
        
        System.out.println("Busqueda de la Entidad " + entidad + ": ");
        System.out.println("Ingrese el Identificador: ");
        sql = input.nextLine();
        
        try{
            System.out.println("Resultado de la Busqueda de la Entidad " + entidad + ": ");
            for (int i = 0; i < Crear.Cliente.length; i++) { //Recorro las filas
                for (int j = 0; j < Crear.Cliente[i].length; j++) { // Recorro las columnas
                    if (Crear.Cliente[i][j].equals(sql)) { // Buscamos si el el valor de la matriz que estamos recorriendo es igual al valor que estamos buscando
                        for (int k = 0; k < Crear.cabecera.length; k++) { // Imprimir uno a uno los valores que encontramos mientras recorremos la cabecera
                            System.out.println(Crear.cabecera[j + k] + ": " + Crear.Cliente[i][j + k]);
                        }
                        break;
                    }
                    
                }
                
            }
        }catch(Exception e){
            System.out.println("Este Dato ha sido Eliminado"); // Si hay error es por que un dato fue eliminado
        }
        return sql;
    }
}
