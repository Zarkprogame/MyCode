import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        String factura, menu = "", nom_emp = "XYZ LTDA", nom_cli = "", vehiculo = "", t_seguro = "", contadores;
        int val_hora_carro = 120000, val_hora_moto = 80000, cant_horas, basico, tipo_seg = 0, count_car = 0, count_moto = 0, decision = 1,
        count_s1 = 0, count_s2 = 0, tipo_veh;
        double val_seg_1 = 0.02, val_seg_2 = 0.03,val_seg_3 = 0.04, val_seg_4 = 0.05, valor_neto = 0, seguro = 0, count_car_money = 0,
        count_moto_money = 0, dinero_total;

        menu = "ALQUILER DE CARROS Y MOTOS POR HORA \n" +
                    "Carro = 120000 h \n" +
                    "Moto = 80000 h \n";

        JOptionPane.showMessageDialog(null, menu);
        
        while (decision == 1){
            nom_cli = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Cliente: ");

            tipo_veh = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Vehiculo que desea: \n 1 para Carro \n 2 para Moto"));

            System.out.print("Ingrese la cantidad de horas en las usara su vehiculo: ");
            cant_horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas que usara su vehiculo: "));

            if (tipo_veh == 1){
                vehiculo = "Carro";
                basico = val_hora_carro * cant_horas;
                count_car ++;
                tipo_seg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el seguro que desea: \n 1 para 4%  \n 2 para 5% "));
                if (tipo_seg == 1){
                    t_seguro = "4%";
                    seguro = basico * val_seg_3;
                    count_s1 ++;
                }else if (tipo_seg == 2){
                    t_seguro = "5%";
                    seguro = basico * val_seg_4;
                    count_s2++;
                }else{
                    JOptionPane.showMessageDialog(null, "No es un tipo de seguro","Ponga Atencion",JOptionPane.ERROR_MESSAGE );
                    System.exit(1);
                }
                valor_neto = basico + seguro;
                count_car_money = count_car_money + valor_neto;

            }else if (tipo_veh == 2){
                vehiculo = "Moto";
                basico = val_hora_moto * cant_horas;
                count_moto ++;
                tipo_seg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el seguro que desea: \n 1 para 2%  \n 2 para 3% "));
                if (tipo_seg == 1){
                    t_seguro = "2%";
                    seguro = basico * val_seg_1;
                    count_s1 ++;
                }else if (tipo_seg == 2){
                    t_seguro = "3%";
                    seguro = basico * val_seg_2;
                    count_s2 ++;
                }else{
                    JOptionPane.showMessageDialog(null, "No es un tipo de seguro","Ponga Atencion",JOptionPane.ERROR_MESSAGE );
                    System.exit(1);
                }
                valor_neto = basico + seguro;
                count_moto_money = count_moto_money + valor_neto;

            }else{
                JOptionPane.showMessageDialog(null, "No es un vehiculo contemplado en nuestra base de datos","Ponga Atencion",JOptionPane.ERROR_MESSAGE );
                System.exit(1);
            }

            factura = "_______FACTURA_______ \n" + 
            nom_emp + "\n" +
            "Cliente: " + nom_cli + "\n" +
            "Vehiculo: " + vehiculo + "\n" +
            "Tipo de Seguro: " + t_seguro + "\n" +
            "Valor del Seguro: " + (int)seguro + "\n" +
            "Valor a Pagar: " + (int)valor_neto;
            
            JOptionPane.showMessageDialog(null, factura);

            decision = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea ingresar otro cliente? \n 1 para Si \n 2 para No"));
        }

        dinero_total = count_car_money + count_moto_money;

        contadores = "_______CONTADORES DIARIOS_______ \n" + 
        "Cantidad de Carros: " + (int)count_car + "\n" +
        "Cantidad de Motos: " + (int)count_moto + "\n" +
        count_s1 + " Clientes eligieron el Seguro 1" + "\n" +
        count_s2 + " Clientes eligieron el Seguro 2" + "\n" +
        "Dinero total en Carro: " + (int)count_car_money + "\n" +
        "Dinero total en Moto: " + (int)count_moto_money + "\n" +
        "Total de Dinero hoy: " + (int)dinero_total;

        JOptionPane.showMessageDialog(null, contadores);
    }
}
