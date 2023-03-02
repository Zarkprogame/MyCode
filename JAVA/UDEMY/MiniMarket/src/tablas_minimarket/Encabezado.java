package tablas_minimarket;
import java.util.Scanner;

public class Encabezado {
    
    public static int id_encabezado, id_empresa, id_empleado, id_cliente, subtotal, total;
    public static String fecha_encabezado;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // =================== Toma de Datos ============================ //
        
        System.out.print("Ingrese el Encabezado de su Factura: ");
        id_encabezado = input.nextInt();
        
        System.out.print("Ingrese la Fecha de su Factura: ");
        fecha_encabezado = input.next();
        
        System.out.print("Ingrese el Id de la Empresa: ");
        id_empresa = input.nextInt();
        
        System.out.print("Ingrese el Id del Empleado: ");
        id_empleado = input.nextInt();
        
        System.out.print("Ingrese el Id del Cliente: ");
        id_cliente = input.nextInt();
        
        System.out.print("Ingrese el subtotal de su Factura: ");
        subtotal = input.nextInt();
        
        System.out.print("Ingrese el Total de su Factura: ");
        total = input.nextInt();
        
        // =================== Salida de Datos ============================ //
        
        System.out.println("Su factura " + id_encabezado + " "
                + "fue hecha el " + fecha_encabezado + " "
                + "en la empresa " + id_empresa + " "
                + "por el empleado " + id_empleado + " " 
                + "por un valor en Subtotal de " + subtotal + " "
                + "y un total de " + total + ". \n "
                + "Muchas gracias por tu compra " + id_cliente);
        
        
    }
}
