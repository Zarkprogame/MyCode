package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Zark
 */
public class Reloj {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner input = new Scanner(System.in);
        int choose, vel, speed = 0, apm = 1;
        String horario = "";
        
        System.out.print("""
                         <1> Para Reloj de Formato de 24 Horas 
                         <2> Para Reloj de Formato de 12 Horas 
                         Seleccione el Formato del Reloj: """);
        choose = input.nextInt();
        
        System.out.print("""
                         <1> Para 0.5
                         <2> Para Normal
                         <3> Para X100
                         <4> Para X512
                         <5> Para Maximo
                         Seleccione el Formato del Reloj: """);
        vel = input.nextInt();
        
        if (vel == 1) {
            speed = 2000;
        }else if (vel == 2) {
            speed = 1000;
        }else if (vel == 3) {
            speed = 10;
        }else if (vel == 4) {
            speed = 4;
        }else if (vel == 5) {
            speed = 0;
        }else{
            System.out.println("No es una Velocidad Valida.");
            System.exit(0);
        }
        
        if (choose == 1) {
            
            while (true) {
                
                for (int hora = 0; hora < 24; hora++) {
                    String hora1 = String.format("%02d",hora);
            
                    for (int minutos = 0; minutos < 60; minutos++) {
                        String minutos1 = String.format("%02d",minutos);

                        for (int segundos = 0; segundos < 60; segundos++) {
                            String segundos1 = String.format("%02d",segundos);

                            Thread.sleep(speed);

                            if (segundos < 10 || minutos < 10 || hora < 10) {
                                System.out.print("""
                                               ___________________________
                                              |  _______________________  |
                                              | |                       | |
                                              | |     %s : %s : %s      | |
                                              | |_______________________| |
                                              |___________________________|
                                               """.formatted(hora1,minutos1,segundos1));

                            }else{
                                System.out.print("""
                                               ___________________________
                                              |  _______________________  |
                                              | |                       | |
                                              | |     %s : %s : %s      | |
                                              | |_______________________| |
                                              |___________________________|
                                               """.formatted(hora,minutos,segundos));

                            }
                        } 
                    }
                }
            }
            
        }else if (choose == 2) {
            
            while (true){
                
                for (int hora = 0; hora < 12; hora++) {
                    String hora1 = String.format("%02d",hora);

                    for (int minutos = 0; minutos < 60; minutos++) {
                        String minutos1 = String.format("%02d",minutos);

                        for (int segundos = 0; segundos < 60; segundos++) {
                            String segundos1 = String.format("%02d",segundos);

                            Thread.sleep(speed);

                            if (apm % 2 == 1) {
                                horario = "AM";
                            }else{
                                horario = "PM";
                            }

                            if (segundos < 10 || minutos < 10 || hora < 10) {
                                System.out.print("""
                                               ___________________________
                                              |  _______________________  |
                                              | |                       | |
                                              | |   %s : %s : %s : %s   | |
                                              | |_______________________| |
                                              |___________________________|
                                               """.formatted(hora1,minutos1,segundos1, horario));

                            }else{
                                System.out.print("""
                                               ___________________________
                                              |  _______________________  |
                                              | |                       | |
                                              | |   %s : %s : %s : %s   | |
                                              | |_______________________| |
                                              |___________________________|
                                               """.formatted(hora,minutos,segundos, horario));

                            }
                        } 
                    }
                }
                apm ++;
            }
        }else{
            System.out.println("No Es un Reloj Valido");
            System.exit(0);
        }
    }
}

