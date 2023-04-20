package CRUD;

import Vista.MenuEntidades;

public class Mostrar {
    
    static int tipoEntidad = MenuEntidades.entidad;
    public static int registros;
    
    public static void mostrarDatos(){
        String cliente = "Cliente";
        String empresa = "Empresa";
        String producto = "Producto";
        String caja = "Caja";
        String entidad = "";
        registros = Crear.nFilas;
        
        if (registros == 0) {
            System.out.println("No hay Datos");
            System.exit(0);
        }
        
        switch (tipoEntidad) {
            case 1 -> entidad = cliente;
            case 2 -> entidad = empresa;
            case 3 -> entidad = producto;
            case 4 -> entidad = caja;
        }
        System.out.println("Datos de la tabla " + entidad + ": ");
        
        for (String cabecera1 : Crear.cabecera) {
            System.out.print(cabecera1 + " |");
        }
        System.out.println("");
        for (Object[] cliente1 : Crear.Cliente) {
            for (Object item : cliente1) {
                System.out.print(item + " |");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
