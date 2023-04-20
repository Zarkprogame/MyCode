package Formularios;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import java.awt.Image;

public class ope extends Form1{
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        //MUESTRA EL FORMULARIO
        jf.setVisible(true);
        
        
        //VARIABLES PARA HACER COMPARACIONES
        String cedula = jt2.getText(), cod = jt6.getText();
        
        //BOTON BUSCAR
        if (e.getSource() == btBuscar) {
            if ("1014".equals(cedula)) { // DATOS PREDEFINIDOS
                jt3.setText("Camilo Montenegro");
                jt4.setText("3012262894");
                jt5.setText("Calle 35a # 1 - 81");
            }else{ // SI EL USUARIO NO SE ENCUENTRA
                JOptionPane.showMessageDialog(null, "El Usuario No se Encuentra");
            }
        }
        
        //BOTON BUSCAR CODIGO
        if (e.getSource() == btCodigo) {
            
            for (int i = 0; i < datos.length; i++) {
                
                String ph = "ImagenesF/%s.jpg";
                if (productos[i][0].equals(cod)) {
                    ImageIcon foto = new ImageIcon(getClass().getResource(String.format(ph, productos[i][1])));
                    ImageIcon mitad = new ImageIcon(foto.getImage().getScaledInstance(jlFoto.getWidth(), jlFoto.getHeight(), Image.SCALE_DEFAULT));
                    jlFoto.setIcon(mitad);
                    
                    
                    for (int l = 0; l <= 2; l++) {
                        datos[i][l] = productos[i][l];
                    }
                    


                }
            }

            //CANTIDAD * VALOR DE CADA PRODUCTO
            for (int i = 0; i < datos.length; i++) {
                if (datos[i][3] != null) {
                    datos[i][4] = Integer.toString(Integer.parseInt(datos[i][2]) * Integer.parseInt(datos[i][3]));
                }
            }
            
        }
        
        //GUARDAR OPERACIONES FINALES
        int st = 0;
        double iva = 0, descuento = 0, granTotal = 0, aum = 0;
        
        if (e.getSource() == btAceptar) {
            
            String com = (String)combo.getSelectedItem();
            
            for (int i = 0; i < datos.length;i++) {
                if (datos[i][4] == null) {
                    //datos[i][4] = Integer.toString(0);
                    continue;
                }
                st = st + Integer.parseInt(datos[i][4]);
                jt7.setText(" " + st);
            }
            
            if(com.equals("Cheque")) {
                    String c = JOptionPane.showInputDialog("Cheque Valido? <Si> <No> ");
                    if (c.equalsIgnoreCase("si")) {
                        iva = st * 0.19;
                        descuento = st * 0.025;
                        granTotal = (iva + st) - descuento;
                        jt8.setText(" " + (int)descuento);
                        jt9.setText(" " + (int)iva);
                        jt10.setText(" " + (int)granTotal);
                    }else if (c.equalsIgnoreCase("no")) {
                        iva = st * 0.19;
                        aum = st * 0.10;
                        granTotal = iva + st + aum;
                        jt8.setText(" " + (int)descuento);
                        jt9.setText(" " + (int)iva);
                        jt10.setText(" " + (int)granTotal);
                    }
                }else if(com.equals("Efectivo")) {
                    iva = st * 0.19;
                    granTotal = iva + st;
                    jt8.setText(" " + (int)descuento);
                    jt9.setText(" " + (int)iva);
                    jt10.setText(" " + (int)granTotal);
                }else if(com.equals("Credito")) {
                    iva = st * 0.19;
                    descuento = st * 0.08;
                    granTotal = (iva + st) - descuento;
                    jt8.setText(" " + (int)descuento);
                    jt9.setText(" " + (int)iva);
                    jt10.setText(" " + (int)granTotal);
                }
            }
        
        //BOTON IMPRIMIR FACTURA
        
        if (e.getSource() == btImpFac) {
            String fecha = "10/10/2023";
            JOptionPane.showMessageDialog(null,"""
                                         _______________________________
                                               CUBOS RUBIK CALI           
                                             Juan Camilo Montenegro        
                                                Tel: 3178773412            
                                              Calle 76 1A 13 - 18      
                                         N° Factura: %s
                                         Fecha: %s                               
                                         Cliente: %s                             
                                         C.C: %s                                 
                                         Direccion: %s                           
                                         Telefono: %s                            
                                        ______________________________
                                         Forma de Pago: %s
                                         Subtotal: %s                            
                                         Descuento: %s                           
                                         Iva: %s                                 
                                         Valor total: %s                         
                                        ______________________________
                                        """.formatted(jt1.getText(),fecha,jt3.getText(),jt2.getText(),jt5.getText(),jt4.getText(),(String)combo.getSelectedItem(),jt7.getText(),jt8.getText(),jt9.getText(),jt10.getText()));
        }
        
        //BOTON SALIR DEL FORMULARIO
        if (e.getSource() == btSalir) {
            System.exit(0);
        }
    }
}
