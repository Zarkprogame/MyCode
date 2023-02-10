//Ingresar 5 numeros, mostrarlos con su promedio y la suma total.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int counter, user_numbers;
        double accumulator = 0, average = 0; 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros: ");

        for (counter = 0; counter <= 4; counter++){
            System.out.print("Ingrese el Numero: " + (counter + 1) + ": ");
            user_numbers = teclado.nextInt();
            accumulator += user_numbers;
        }
        average = accumulator / counter;
        System.out.println("Promedio:" + average);
    }
}
