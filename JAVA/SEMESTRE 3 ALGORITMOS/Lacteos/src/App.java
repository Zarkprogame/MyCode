import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nombre_empresa = "Lacteos La Victoria", nombre_empleado;
        int basico=1500000, val_bolsa=1000, num_bolsas, val_venta, transporte=35000;
        double por_comision=0.05, por_ahorro=0.02, comision_venta, ahorro, val_pagar;

        System.out.print("Ingrese el Nombre del empleado: ");
        nombre_empleado = teclado.nextLine();

        System.out.print("Ingrese la cantidad de bolsas que vendio " + nombre_empleado + ": ");
        num_bolsas = teclado.nextInt();

        val_venta = num_bolsas * val_bolsa;

        comision_venta = val_venta * por_comision;

        ahorro = basico * por_ahorro;

        val_pagar = basico + comision_venta - ahorro + transporte;    
        
        System.out.println("------PAGO------");
        System.out.println(nombre_empresa);
        System.out.println(nombre_empleado);
        System.out.println("El empleado " + nombre_empleado + " vendio " + num_bolsas + " Bolsas de leche");
        System.out.println("Su valor de venta fue: " + val_venta);
        System.out.println("Comision de Venta: " + (int)comision_venta);
        System.out.println("El ahorro fue de: " + (int)ahorro);
        System.out.println("El valor a pagar es: " + (int)val_pagar);
        System.out.println("Que tenga buen dia " + nombre_empleado);
    }
}
