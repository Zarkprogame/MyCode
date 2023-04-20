package Formularios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form1 implements ActionListener {

    //Matriz predefinida de los Productos -------------------------------------------------------------------------------------------------------------------------------|
    String[][] productos = {{"1010", "2x2", "26000","0"}, {"2020", "3x3", "29000","1"}, {"3030", "4x4", "38000","2"}, {"4040", "5x5", "48000","3"}, {"5050", "6x6", "70000","4"}, {"6060", "7x7", "85000","5"},
    {"7070", "Megaminx", "46000","6"}, {"8080", "Mirror", "32000","7"}, {"9090", "Pyraminx", "40000","8"}, {"0000", "Skewb", "40000","9"}};   // CUBOS RUBIK             

    String[][] datos = new String[productos.length][5]; // Matriz que maneja la Grilla                                                                                          

    //String[][] aux = new String[10][5]; // Matriz que guarda datos y los actualiza                                                                                      
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------|

    //Creamos, asignamos tamaño, cabeceras e instanciamos datos y titulos --------------------------------------------------------
    String[] titulo = {"Codigo", "Descripcion", "Valor Unitario", "Cantidad", "Precio Total",}; // Cabecera de la Grilla

    JScrollPane scroll = new JScrollPane(); // Propiedad para hacer scroll a la tabla

    JTable tabla = new JTable(datos, titulo); // Instanciamos la tabla con la cabecera y la matriz de los datos

    Dimension d = new Dimension(); // Instanciamos el tamaño de la pantalla 
    //----------------------------------------------------------------------------------------------------------------------------

    //Creamos el comboBox y añadimos sus respectivos datos---
    String[] pago = {"", "Efectivo", "Cheque", "Credito"};

    JComboBox combo = new JComboBox(pago);

    //-------------------------------------------------------

    //Variables para la INTERFAZ del formulario---------------------------------------------------------------------------|
    JButton btAceptar, btBuscar, btCodigo, btSalir, btImpFac; // BOTONES

    JLabel jlFoto, jlT, jlDireccion, jlNumero, jlFactura, jlSantiCali, jlCedula, jlNomCliente, jlTelCliente, jlDirCliente, jlFormaPago, jlSubTotal, jlDescuento, jlIva, jlGranTotal; // ETIQUETAS

    JTextField jt1, jt2, jt3, jt4, jt5, jt6, jt7, jt8, jt9, jt10; // CAJAS DE TEXTO
    //--------------------------------------------------------------------------------------------------------------------|

    //INSTANCIAMOS EL FORMULARIO 
    JFrame jf = new JFrame("FACTURA DE VENTA");

    public Form1() {

        // ELIMINAMOS EL LAYOUT
        jf.setLayout(null);

        //DATOS DE LAS ETIQUETAS Y SUS POCISIONES Y TAMAÑOS
        jlFoto = new JLabel("");
        jlFoto.setBounds(10, 10, 100, 100);

        jlT = new JLabel("SISTEMAS DEL FUTURO");
        jlT.setBounds(200, 10, 140, 10);

        jlDireccion = new JLabel("Calle 76 1A 13 - 18");
        jlDireccion.setBounds(200, 30, 140, 10);

        jlNumero = new JLabel("3012262894");
        jlNumero.setBounds(400, 30, 140, 10);

        jlFactura = new JLabel("N° Factura: ");
        jlFactura.setBounds(540, 35, 90, 10);

        jlSantiCali = new JLabel("Santiago de Cali");
        jlSantiCali.setBounds(305, 50, 140, 20);

        jlCedula = new JLabel("Cedula de Ciudadania: ");
        jlCedula.setBounds(10, 130, 140, 20);

        jlNomCliente = new JLabel("Nombre del Cliente: ");
        jlNomCliente.setBounds(10, 170, 140, 20);

        jlTelCliente = new JLabel("Telefono del Cliente: ");
        jlTelCliente.setBounds(10, 210, 140, 20);

        jlDirCliente = new JLabel("Direccion del Cliente: ");
        jlDirCliente.setBounds(10, 250, 140, 20);

        jlFormaPago = new JLabel("Forma de Pago: ");
        jlFormaPago.setBounds(300, 250, 140, 20);

        jlSubTotal = new JLabel("Sub Total: ");
        jlSubTotal.setBounds(430, 500, 140, 20);

        jlDescuento = new JLabel("Descuento: ");
        jlDescuento.setBounds(430, 530, 140, 20);

        jlIva = new JLabel("Iva: ");
        jlIva.setBounds(430, 560, 140, 20);

        jlGranTotal = new JLabel("Gran Total: ");
        jlGranTotal.setBounds(430, 590, 140, 20);

        //INSTANCIANDO LOS CUADROS DE TEXTO Y SUS POSICIONES Y TAMAÑOS
        jt1 = new JTextField();
        jt1.setBounds(550, 10, 90, 20);

        jt2 = new JTextField();
        jt2.setBounds(150, 132, 100, 20);

        jt3 = new JTextField();
        jt3.setBounds(150, 172, 140, 20);

        jt4 = new JTextField();
        jt4.setBounds(150, 212, 140, 20);

        jt5 = new JTextField();
        jt5.setBounds(150, 252, 140, 20);

        jt6 = new JTextField();
        jt6.setBounds(10, 300, 70, 20);

        jt7 = new JTextField();
        jt7.setBounds(540, 500, 140, 20);

        jt8 = new JTextField();
        jt8.setBounds(540, 530, 140, 20);

        jt9 = new JTextField();
        jt9.setBounds(540, 560, 140, 20);

        jt10 = new JTextField();
        jt10.setBounds(540, 590, 140, 20);

        //NOMBRANDO LOS BOTONES Y SUS POCISIONES Y TAMAÑOS
        btAceptar = new JButton("Aceptar");
        btAceptar.setBounds(480, 630, 85, 20);

        btBuscar = new JButton("Buscar");
        btBuscar.setBounds(260, 132, 80, 20);

        btCodigo = new JButton("Buscar Codigo");
        btCodigo.setBounds(90, 300, 130, 20);

        btSalir = new JButton("Salir");
        btSalir.setBounds(400, 630, 70, 20);
        
        btImpFac = new JButton("Imprimir Factura");
        btImpFac.setBounds(570, 630, 130, 20);

        //POCISION Y TAMAÑO DEL COMBOBOX
        combo.setBounds(400, 250, 90, 20);

        //CABECERAS ESTATICAS
        scroll.setViewportView(tabla);

        //POSICION Y TAMAÑO DE LA GRILLA
        scroll.setBounds(10, 330, 685, 150);

        //AÑADIENDO LA GRILLA AL FORMULARIO
        jf.add(scroll);

        //BORDES NEGROS DE LA ETIQUETA FOTO
        jlFoto.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));

        // AÑADIMOS LAS ETIQUETAS AL FORMULARIO
        jf.add(jlFoto);
        jf.add(jlT);
        jf.add(jlDireccion);
        jf.add(jlNumero);
        jf.add(jlFactura);
        jf.add(jlSantiCali);
        jf.add(jlCedula);
        jf.add(jlNomCliente);
        jf.add(jlTelCliente);
        jf.add(jlDirCliente);
        jf.add(jlFormaPago);
        jf.add(jlSubTotal);
        jf.add(jlDescuento);
        jf.add(jlIva);
        jf.add(jlGranTotal);

        //AÑADIMOS LOS CUADROS DE TEXTOS LA FORMULARIO
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jt3);
        jf.add(jt4);
        jf.add(jt5);
        jf.add(jt6);
        jf.add(jt7);
        jf.add(jt8);
        jf.add(jt9);
        jf.add(jt10);

        //AÑADIENDO LOS BOTONES AL FORMULARIO
        jf.add(btAceptar);
        jf.add(btBuscar);
        jf.add(btCodigo);
        jf.add(btSalir);
        jf.add(btImpFac);

        //AÑADIENDO EL COMBOBOX AL FORMULARIO
        jf.add(combo);

        //AÑADIENDO EL LISTENER AL BOTON PARA QUE FUNCIONE CON CLICK
        btAceptar.addActionListener(this);
        btBuscar.addActionListener(this);
        btCodigo.addActionListener(this);
        btSalir.addActionListener(this);
        btImpFac.addActionListener(this);
        combo.addActionListener(this);

        //CERRAR EL FORMULARIO CON LA X
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //IMPIDE QUE SE MODIFIQUE EL TAMAÑO DEL FORMULARIO
        jf.setResizable(false);

        //
        jf.setLocation((int)((d.getWidth() / 2) + 290), 10);

        //TAMAÑO NECESARIO PARA VISUALIZAR TODO
        jf.pack();

        //TAMAÑO DE VENTANA
        jf.setSize(720, 720);

    }

    public static void main(String[] args) {
        Form1 frame = new Form1(); // INSTANCIAMOS LA CLASE
        ope op = new ope();
        ActionEvent e = null;
        op.actionPerformed(e);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //METODO LISTENER
    }

}
