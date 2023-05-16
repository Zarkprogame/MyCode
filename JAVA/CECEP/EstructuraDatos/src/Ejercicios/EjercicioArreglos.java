package Ejercicios;

import java.util.Scanner;

public class EjercicioArreglos {
    public static void main(String[] args) {
        Scanner nLea = new Scanner(System.in);
        
        int ArrayEmp1[] = new int[6];
        int ArrayEmp2[] = new int[6];
        int ArrayEmp3[] = new int[6], Cm=0;
        int Array2022[] = {230, 455, 566, 1000, 800, 9000};
        String ArrayMeses[] = {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        String ArraySemRes[] = new String[6];
        int ArrayRes[] = new int[6];
        
        System.out.println("Venta del empleado 1"
                + "\n=========================");
        for (int i = 0; i < ArrayEmp1.length; i++) {
            System.out.println("Ingresar ventas empleado 1. Mes " + ArrayMeses[i]);
            ArrayEmp1[i] = nLea.nextInt();
        }
        
        System.out.println("Venta del empleado 2"
                + "\n=========================");
        for (int i = 0; i < ArrayEmp2.length; i++) {
            System.out.println("Ingresar ventas del empleado 2. Mes " + ArrayMeses[i]);
            ArrayEmp2[i] = nLea.nextInt();
        }
        
        System.out.println("Venta del empleado 3"
                + "\n=========================");
        for (int i = 0; i < ArrayEmp3.length; i++) {
            System.out.println("Ingresar ventas del empleado 3. Mes " + ArrayMeses[i]);
            ArrayEmp3[i] = nLea.nextInt();
        }
        
        for (int i = 0; i < ArrayMeses.length; i++) {
            System.out.print("| " + ArrayMeses[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < ArrayEmp1.length; i++) {
            System.out.print("| " + ArrayEmp1[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < ArrayEmp2.length; i++) {
            System.out.print("| " + ArrayEmp2[i]);
        }
        
        System.out.println("");
        for (int i = 0; i < ArrayEmp3.length; i++) {
            System.out.print("| " + ArrayEmp3[i]);
        }
        
        
    }
}
