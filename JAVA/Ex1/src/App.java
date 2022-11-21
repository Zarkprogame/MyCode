import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int user_number, multi;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un Numero: ");
        user_number = teclado.nextInt();

        System.out.println("Primeras 10 posiciones en la tabla de multiplicar del numero: " + user_number + ": ");

        for (int counter = 1; counter <= 10; counter ++){
            multi = counter * user_number;
            System.out.println(counter + " * " + user_number + " = " + multi);
        }
        
    }
}