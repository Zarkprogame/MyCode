package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Zark
 */
public class Reloj12 {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner input = new Scanner(System.in);
        int vel, speed = 0, apm = 1, day = 0;
        String horario = "", dia = "MON";
        
        System.out.print("""
                         <1> Para velocidad normal
                         Cualquier otro numero velocidad Maxima
                         Seleccione el Formato del Reloj: """);
        vel = input.nextInt();
        
        if (vel == 1) {
            speed = 1000;
        }else{
            speed = 0;
        }
        
        while (true){
            if (apm % 2 == 1) {
                horario = "AM";
                day++;
            }else{
                horario = "PM";
            }
            
                for (int hora = 0; hora < 12; hora++) {
                    String hora1 = String.format("%02d",hora);

                    for (int minutos = 0; minutos < 60; minutos++) {
                        String minutos1 = String.format("%02d",minutos);

                        for (int segundos = 0; segundos < 60; segundos++) {
                            String segundos1 = String.format("%02d",segundos);

                            Thread.sleep(speed);

                            if (day == 1) {
                                dia = "MON";
                            }else if (day == 2) {
                                dia = "TUE";
                            }else if (day == 3) {
                                dia = "WED";
                            }else if (day == 4) {
                                dia = "THU";
                            }else if (day == 5) {
                                dia = "FRI";
                            }else if (day == 6) {
                                dia = "SAT";
                            }else if (day == 7) {
                                dia = "SUN";
                                day = 0;
                            }

                            if (segundos < 10 || minutos < 10 || hora < 10) {
                                System.out.print("""
                                               ___________________________
                                              |  _______________________  |_
                                              | | %s                   | |_|
                                              | |   %s : %s : %s : %s   | |_
                                              | |_______________________| |_|
                                              |___________________________|
                                               """.formatted(dia, hora1,minutos1,segundos1, horario));

                            }else{
                                System.out.print("""
                                               ___________________________
                                              |  _______________________  |_
                                              | | %s                   | |_|
                                              | |   %s : %s : %s : %s   | |_
                                              | |_______________________| |_|
                                              |___________________________|
                                               """.formatted(dia, hora,minutos,segundos, horario));

                            }
                        }
                    }
                }
                apm ++;
            }
    }
}