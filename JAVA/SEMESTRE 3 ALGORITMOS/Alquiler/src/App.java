import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nom_emp = "XYZ LTDA", nom_cli, tipo_veh, tipo_seg;
        int val_hora_carro = 80000, val_hora_moto = 50000, val_hora_bici = 20000, val_seg_bas = 2000, val_seg_prem = 4000, cant_horas, basico, seguro = 0;
        double dto_carro = 0.03, dto_moto = 0.02, dto_bici = 0.01, desc, valor_neto = 0;

        System.out.print("Ingrese el nombre del Cliente: ");
        nom_cli = teclado.nextLine();

        System.out.println("<Carro>, <Moto>, <Bicicleta>");
        System.out.print("Ingrese el vehiculo que desea: ");
        tipo_veh = teclado.next();

        System.out.print("Ingrese la cantidad de horas en las usara su vehiculo: ");
        cant_horas = teclado.nextInt();

        System.out.println("<Basico>, <Premium>");
        System.out.print("Ingrese el Tipo de seguro que desea para su vehiculo: ");
        tipo_seg = teclado.next();

        if ("carro".equalsIgnoreCase(tipo_veh)){

            basico = val_hora_carro * cant_horas;
            desc = basico * dto_carro;
            if ("basico".equalsIgnoreCase(tipo_seg)){
                seguro = val_seg_bas * cant_horas;
            }else if ("premium".equalsIgnoreCase(tipo_seg)){
                seguro = val_seg_prem * cant_horas;
            }else{
                System.out.println("No es un tipo de seguro.");
                System.exit(1);
            }
            valor_neto = basico - desc + seguro;

        }else if ("moto".equalsIgnoreCase(tipo_veh)){

            basico = val_hora_moto * cant_horas;
            desc = basico * dto_moto;
            if ("basico".equalsIgnoreCase(tipo_seg)){
                seguro = val_seg_bas * cant_horas;
            }else if ("premium".equalsIgnoreCase(tipo_seg)){
                seguro = val_seg_prem * cant_horas;
            }else{
                System.out.println("No es un tipo de seguro.");
                System.exit(1);
            }
            valor_neto = basico - desc + seguro;

        }else if ("bicicleta".equalsIgnoreCase(tipo_veh)){

            basico = val_hora_bici * cant_horas;
            desc = basico * dto_bici;
            if ("basico".equalsIgnoreCase(tipo_seg)){
                seguro = val_seg_bas * cant_horas;
            }else if ("premium".equalsIgnoreCase(tipo_seg)){
                seguro = val_seg_prem * cant_horas;
            }else{
                System.out.println("No es un tipo de seguro.");
                System.exit(1);
            }
            valor_neto = basico - desc + seguro;
            
        }else{
            System.out.println("No es un vehiculo contemplado en nuestra base de datos");
            System.exit(1);
        }

        System.out.println("_______FACTURA_______");
        System.out.println(nom_emp);
        System.out.println(nom_cli);
        System.out.println(tipo_veh);
        System.out.println(tipo_seg);
        System.out.println(seguro);
        System.out.println(valor_neto);

    }
}
