import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int user_number, multi;
        String vector[] = new String[5];
        String mostrar = "Primeras 10 posiciones en la tabla de multiplicar de tu numero: \n";
        user_number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero: "));

        for (int counter = 1; counter < 11; counter++){
            multi = counter * user_number;
            vector[0] = String.valueOf(counter);
            vector[1] = " * ";
            vector[2] = String.valueOf(user_number);
            vector[3] = " = ";
            vector[4] = String.valueOf(multi);

            for (int i = 0; i < 5; i++){
                mostrar = mostrar + vector[i];
            }
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
}