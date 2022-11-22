import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int user_number, pares = 0, impares = 0, count_pares = 0, count_impares = 0, suma, promedio;
        String vector[] = new String[6];
        String texto[] = new String[6];
        String mostrar = "";
        for (int counter = 1; counter <= 10; counter++){
            user_number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa 10 numeros \n Ingrese el Numero " + counter + ": "));
            if (user_number % 2 == 0){
                pares = pares + user_number;
                count_pares ++;
            }else{
                impares = impares + user_number;
                count_impares ++;
            }
        }
        suma = pares + impares;
        promedio = suma / 10;

        texto[0] = "Cantidad de Pares: ";
        texto[1] = "Cantidad de Impares: ";
        texto[2] = "Suma de Pares: ";
        texto[3] = "Suma de Impares: ";
        texto[4] = "Suma Total: ";
        texto[5] = "Promedio: ";

        vector[0] = String.valueOf(count_pares);
        vector[1] = String.valueOf(count_impares);
        vector[2] = String.valueOf(pares);
        vector[3] = String.valueOf(impares);
        vector[4] = String.valueOf(suma);
        vector[5] = String.valueOf(promedio);

        for (int i = 0; i < 6; i++){
            mostrar += texto[i] + vector[i];
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
     }
 }