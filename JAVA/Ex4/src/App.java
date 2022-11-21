import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nom_emp = "XYZ LTDA", nom_cli = "", tipo_veh = "", decision = "n";
        int val_hora_carro = 120000, val_hora_moto = 80000, cant_horas, basico, tipo_seg = 0, count_car = 0, count_moto = 0,
        count_s1 = 0, count_s2 = 0;
        double val_seg_1 = 0.02, val_seg_2 = 0.03,val_seg_3 = 0.04, val_seg_4 = 0.05, valor_neto = 0, seguro = 0, count_car_money = 0,
        count_moto_money = 0, dinero_total;

        System.out.println("ALQUILER DE CARROS Y MOTOS POR HORA");
        System.out.println("Carro = 120000 h, Seguro 1 = 4% y Seguro 2 = 5%");
        System.out.println("Moto = 80000 h, Seguro 1 = 2% y Seguro 2 = 3%");

        System.out.println("Desea Ingresar a un cliente? <S> para Si, <N> para No.");
        decision = teclado.next();
        
        while ("s".equalsIgnoreCase(decision)){
            System.out.print("Ingrese el nombre del Cliente: ");
            nom_cli = teclado.next();

            System.out.println("<Carro>, <Moto>");
            System.out.print("Ingrese el vehiculo que desea: ");
            tipo_veh = teclado.next();

            System.out.print("Ingrese la cantidad de horas en las usara su vehiculo: ");
            cant_horas = teclado.nextInt();

            System.out.println("< 1 > < 2 >");
            System.out.print("Ingrese el Tipo de seguro que desea para su vehiculo: ");
            tipo_seg = teclado.nextInt();


            if ("carro".equalsIgnoreCase(tipo_veh)){
                basico = val_hora_carro * cant_horas;
                count_car ++;

                if (tipo_seg == 1){
                    seguro = basico * val_seg_3;
                    count_s1 ++;
                }else if (tipo_seg == 2){
                    seguro = basico * val_seg_4;
                    count_s2++;
                }else{
                    System.out.println("No es un tipo de seguro.");
                    System.exit(1);
                }
                valor_neto = basico + seguro;
                count_car_money = count_car_money + valor_neto;

            }else if ("moto".equalsIgnoreCase(tipo_veh)){
                basico = val_hora_moto * cant_horas;
                count_moto ++;

                if (tipo_seg == 1){
                    seguro = basico * val_seg_1;
                    count_s1 ++;
                }else if (tipo_seg == 2){
                    seguro = basico * val_seg_2;
                    count_s2 ++;
                }else{
                    System.out.println("No es un tipo de seguro.");
                    System.exit(1);
                }
                valor_neto = basico + seguro;
                count_moto_money = count_moto_money + valor_neto;

            }else{
                System.out.println("No es un vehiculo contemplado en nuestra base de datos");
                System.exit(1);
            }

            System.out.println("_______FACTURA_______");
            System.out.println(nom_emp);
            System.out.println("Cliente: " + nom_cli);
            System.out.println("Vehiculo: " + tipo_veh);
            System.out.println("Tipo de Seguro: " + tipo_seg);
            System.out.println("Valor del Seguro: " + seguro);
            System.out.println("Valor a Pagar: " + valor_neto);

            System.out.println("Desea ingresar otro cliente? <S> para Si, <N> para No");
            decision = teclado.next();
        }

        dinero_total = count_car_money + count_moto_money;

        System.out.println("_______CONTADORES_______");
        System.out.println("Cantidad de Carros: " + count_car);
        System.out.println("Cantidad de Motos: " + count_moto);
        System.out.println(count_s1 + " eligieron el seguro 1");
        System.out.println(count_s2 + " eligieron el seguro 2");
        System.out.println("Dinero total en Carro: " + (int)count_car_money);
        System.out.println("Dinero total en Moto: " + (int)count_moto_money);
        System.out.println("Total de Dinero hoy: " + (int)dinero_total);
        

    }
}
