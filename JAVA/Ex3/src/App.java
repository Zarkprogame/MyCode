import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int user_number, pares = 0, impares = 0, count_pares = 0, count_impares = 0, suma, promedio;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("<Ingresa 10 numeros>");

        for (int counter = 1; counter <= 10; counter ++){
            System.out.print("Ingrese el Numero " + counter + ": ");
            user_number = teclado.nextInt();

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

        System.out.println("Hay " + count_pares + " Pares");
        System.out.println("Hay " + count_impares + " Impares");
        System.out.println("La suma de los Pares es: " + pares);
        System.out.println("La suma de los impares es: " + impares);
        System.out.println("La suma de los 10 numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
    }
}