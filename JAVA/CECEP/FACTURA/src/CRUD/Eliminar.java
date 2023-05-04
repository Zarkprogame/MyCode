package CRUD;

import java.util.Scanner;

public class Eliminar {
    
    public static int registros, contador;
    public static Object sql;
    
    public static void eliminarRegistro(){
        
        Scanner input = new Scanner(System.in);
        registros = Crear.nFilas;
        System.out.println("Ingrese Identificacion: ");
        sql = input.nextLine();
        boolean encuentra = false;
        int pos = 0;
        
        while(!encuentra && pos < registros){ //mientras encuentre dato y la posicion sea menor a los registros
            if (sql.equals(Crear.Cliente[pos][0])) { // si el valor que estamos buscando es igual al valor que estamos recorriendo 
                encuentra = true; // encuentra va a ser verdadero y saldra del ciclo
            }else{ // sino cambiamos la pocision y seguimos buscando el dato
                pos++;
            }
        }
        
        if (pos < registros) { // si poscision es menor a los registros
            if (registros == 1) { // verificamos si hay solo un registro para no tener error de desbordamiento
                registros = registros + 0;
            }else{
                registros = registros - 1;
            }
            
            Object[][] nuevaMatriz = new Object[registros][Crear.Cliente[0].length]; // creamos una nueva matriz para reemplazarla por la que vamos a eliminar
            contador = 0;
            
            for (int filaActual = 0; filaActual < registros; filaActual++) { // recorremos las filas
                for (int columnaActual = 0; columnaActual < Crear.cabecera.length; columnaActual++) { // recorremos las columnas
                    if (pos == filaActual) { // nos pocisionas en el dato dentro de la matriz
                        filaActual ++;
                    }
                    if (pos > 0) {
                        nuevaMatriz[contador][columnaActual] = Crear.Cliente[filaActual][columnaActual];
                    }
                }
                contador++;
            }
            for (int i = 0; i < Crear.cabecera.length; i++) { //Remplazamos con null los valores de la matriz
                Crear.Cliente[pos][i] = null;
            }
        }else{ // si no encontro un valor igual imprimir que no hay coincidencias
            System.out.println("El identificador no Existe");
        }
    }
}
