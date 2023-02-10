import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int user_number, serie;
        String vector[] = new String[3];
        String mostrar = "Serie de numeros hasta el Tuyo: \n";
        user_number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero: "));

        for (int counter = 1; counter < (user_number); counter++){
            serie = counter + 1;
            vector[0] = String.valueOf(counter);
            vector[1] = " - ";
            vector[2] = String.valueOf(serie);
            counter ++;

            for (int i = 0; i < 3; i++){
                mostrar = mostrar + vector[i];
            }
            mostrar += "  ";
        }
        if (user_number % 2 == 1){
            mostrar += user_number;
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
}