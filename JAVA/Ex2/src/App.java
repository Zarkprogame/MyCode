import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int user_number, serie;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un Numero: ");
        user_number = teclado.nextInt();

        System.out.println("Serie de numeros hasta el " + user_number + ": ");

        for (int counter = 0; counter <= (user_number - 1); counter ++){
            serie = counter + 1;
            System.out.println(counter + " - " + serie);
        }
        
    }
}