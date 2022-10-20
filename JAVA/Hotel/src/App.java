import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nom_hotel = "La Ultima Noche", nom_cli, tipo_hab;
        int val_sen = 50000, val_doble = 90000, num_noches, val_comida_sen = 8500, val_comida_doble = 10000, num_plato, val_basico, val_comida;
        double por_sen = 0.03, por_doble = 0.04, desc, val_pagar;

        System.out.print("Ingrese el Nombre del Cliente: ");
        nom_cli = teclado.nextLine();

        System.out.print("Ingrese el tipo de habitacion <sencilla> <doble>: ");
        tipo_hab = teclado.next();
        
        System.out.print("Ingrese el Numero de noches que desee hospedarse: ");
        num_noches = teclado.nextInt();

        if ("sencilla".equalsIgnoreCase(tipo_hab)){
            System.out.print("Cuantos platos desea pedir: ");
            num_plato = teclado.nextInt();

            val_basico = val_sen * num_noches;
            desc = val_basico * por_sen;
            val_comida = val_comida_sen * num_plato;
            val_pagar = val_basico - desc + val_comida;

        }else{
            System.out.print("Cuantos platos desea pedir: ");
            num_plato = teclado.nextInt();

            val_basico = val_doble * num_noches;
            desc = val_basico * por_doble;
            val_comida = val_comida_doble * num_plato;
            val_pagar = val_basico - desc + val_comida;
        }
        System.out.println("----FACTURA----");
        System.out.println(nom_hotel);
        System.out.println("Cliente: " + nom_cli);
        System.out.println("Valor de Habitacion: " + val_basico);
        System.out.println("Valor del descuento: " + desc);
        System.out.println("Valor Comida: " + val_comida);
        System.out.println("Total a Pagar: "+ (int)val_pagar);
        System.out.println("Que tenga buen Dia");

    }
}
