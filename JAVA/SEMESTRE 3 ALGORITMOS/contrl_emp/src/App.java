import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nom_com = "XYZ", nom_emp, hijos = "";
        int num_hijos = 0, val_bono = 20000, bono;

        nom_emp = teclado.next();
        System.out.println("Tienes Hijos? <Si>  <No>");
        if ("si".equalsIgnoreCase(hijos)){
            System.out.println("Cuantos hijos tienes?: ");
            num_hijos = teclado.nextInt();
        }else{
            System.out.println("NADA PA USTED");
        }
        bono = num_hijos * val_bono;



    }
}
