import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nom_emp = "Lacteos La Victoria", nom_empleado, tipo_empleado;
        int sueldo_ex = 1000000, sueldo_in = 1200000, ventas, cant_hijos, valor_hijos = 20000, hijos;
        double comision = 0, comision1 = 0.05, comision2 = 0.07, comision3 = 0.08, comision4 = 0.10, valor_neto = 0;

        System.out.println("<Externo>, <Interno>");
        System.out.print("Ingrese el Tipo de de empleado: ");
        tipo_empleado = teclado.next();

        System.out.print("Ingrese el nombre del Cliente: ");
        nom_empleado = teclado.next();

        System.out.print("Ingrese la Cantidad de ventas de " + nom_empleado + ": ");
        ventas = teclado.nextInt();

        System.out.print("Ingrese la Cantidad de hijos que tengas: ");
        cant_hijos = teclado.nextInt();

        hijos = cant_hijos * valor_hijos;

        if ("externo".equalsIgnoreCase(tipo_empleado)){
            if (ventas > 0 && ventas <= 50){
                comision = sueldo_ex * comision1;
            }else if (ventas > 50 && ventas <= 100){
                comision = sueldo_ex * comision2;
            }else if (ventas > 100){
                comision = sueldo_ex * comision3;
            }else{
                System.out.println("No es un numero valido");
            }

            valor_neto = sueldo_ex + comision + hijos;

        }else if("interno".equalsIgnoreCase(tipo_empleado)){
            if (ventas > 0 && ventas <= 50){
                comision = sueldo_in * comision2;
            }else if (ventas > 50 && ventas <= 100){
                comision = sueldo_in * comision3;
            }else if (ventas > 100){
                comision = sueldo_in * comision4;
            }else{
                System.out.println("No es un numero valido");
            }

            valor_neto = sueldo_in + comision + hijos;

        }else {
            System.out.println("No es un tipo de empleado aceptado.");
        }

        System.out.println("-------------Factura--------------");
        System.out.println(nom_emp);
        System.out.println("Empleado: " + nom_empleado);
        System.out.println("Tipo de Empleado: " + tipo_empleado);
        System.out.println("Ventas: " + ventas);
        System.out.println("Comision: " + comision);
        System.out.println("Numero de hijos: " + cant_hijos);
        System.out.println("Valor Neto: " + (int)valor_neto);
    }
}
