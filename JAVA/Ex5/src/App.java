import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String factura, menu = "", nom_emp = "SMART WASH", nom_cli = "", vehiculo = "", contadores, lavado = "";
        int val_carro = 40000, val_camioneta = 50000, completo = 20000, tipo_veh, decision = 1,count_car = 0, count_cam = 0, t_lavado = 0;
        double dto, dto_carro = 0.03, val_pagar = 0, dto_camioneta = 0.05,dinero_car= 0,dinero_cam= 0,dinero_total= 0;

        menu = "SMARTWASH -- Lavadero de Carros y Camionetas \n" +
                    "Carro = 40.000 Exterior y 60.000 Completo \n" +
                    "Camioneta = 50.000 Exterior y 70.000 Completo \n" + 
                    "Carros tienen un descuento del 3% \n" + 
                    "Camionetas tienen un descuento del 5%";

        JOptionPane.showMessageDialog(null, menu);

        while (decision == 1){
            nom_cli = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Cliente: ");

            tipo_veh = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Vehiculo que desea: \n 1 para Carro \n 2 para Camioneta"));

            if (tipo_veh == 1){
                vehiculo = "Carro";
                count_car ++;
                t_lavado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo de lavado que desea: \n 1 para Exterior  \n 2 para Completo "));
                if (t_lavado == 1){
                    lavado = "Exterior";
                    dto = val_carro * dto_carro;
                    val_pagar = val_carro - dto;
                }else if (t_lavado == 2){
                    lavado = "Completo";
                    dto = (val_carro + completo) * dto_carro;
                    val_pagar = (val_carro + completo) - dto;
                }else{
                    JOptionPane.showMessageDialog(null, "No es un tipo de Lavado","Ponga Atencion",JOptionPane.ERROR_MESSAGE );
                    System.exit(1);
                }
                
                dinero_car = dinero_car + val_pagar;

            }else if (tipo_veh == 2){
                vehiculo = "Camioneta";
                count_cam ++;
                t_lavado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo de lavado que desea: \n 1 para Exterior  \n 2 para Completo "));
                if (t_lavado == 1){
                    lavado = "Exterior";
                    dto = val_camioneta * dto_camioneta;
                    val_pagar = val_camioneta - dto;
                }else if (t_lavado == 2){
                    lavado = "Completo";
                    dto = (val_camioneta + completo) * dto_camioneta;
                    val_pagar = (val_camioneta + completo) - dto;
                }else{
                    JOptionPane.showMessageDialog(null, "No es un tipo de Lavado","Ponga Atencion",JOptionPane.ERROR_MESSAGE );
                    System.exit(1);
                }
                
                dinero_cam = dinero_cam + val_pagar;

            }else{
                JOptionPane.showMessageDialog(null, "No es un vehiculo contemplado en nuestra base de datos","Ponga Atencion",JOptionPane.ERROR_MESSAGE );
                System.exit(1);
            }

            factura = "_______FACTURA_______ \n" + 
            nom_emp + "\n" +
            "Cliente: " + nom_cli + "\n" +
            "Vehiculo: " + vehiculo + "\n" +
            "Tipo de Lavado: " + lavado + "\n" +
            "Valor a Pagar: " + (int)val_pagar;
            
            JOptionPane.showMessageDialog(null, factura);

            decision = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea ingresar otro cliente? \n 1 para Si \n 2 para No"));

        }

        dinero_total = dinero_car + dinero_cam;

        contadores = "_______CONTADORES DIARIOS_______ \n" + 
        "Cantidad de Carros: " + (int)count_car + "\n" +
        "Cantidad de Camionetas: " + (int)count_cam + "\n" +
        "Dinero total en Carro: " + (int)dinero_car + "\n" +
        "Dinero total en Camionetas: " + (int)dinero_cam + "\n" +
        "Total de Dinero hoy: " + (int)dinero_total;

        JOptionPane.showMessageDialog(null, contadores);

    }
}
