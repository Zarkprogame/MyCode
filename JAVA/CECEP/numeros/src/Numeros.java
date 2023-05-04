import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        
        //for (int i = 1; i <= 20; i++) {
        //    System.out.println(i);
        //}
        
        Scanner input = new Scanner(System.in);
        
        int cont_par = 0, cont_impar = 0, user_nums;
        
        
        System.out.print("Ingrese 5 numeros: ");
        for (int num = 1; num <= 5; num++) {
            user_nums = input.nextInt();
            if (user_nums % 2 == 0) {
                cont_par ++;
            }else{
                cont_impar ++;
            }
        }
        System.out.println(cont_par + " Numeros son Pares");
        System.out.println(cont_impar + " Numeros son Impares");
    }
}
