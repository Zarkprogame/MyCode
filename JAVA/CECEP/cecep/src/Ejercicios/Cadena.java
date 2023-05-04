package Ejercicios;
import java.util.Scanner;

public class Cadena {
    
            
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String vowels = "aeiouAEIOU", special_char = "!@#$%^&*()_+{}|<>?-=[],./;'`", numbers = "1234567890";
        int i, counter_vowels = 0, counter_special_char = 0, counter_consonants, counter_numbers = 0, counter_spaces = 0;
        
        System.out.print("Ingresa la Cadena que desees: ");
        String user_string = input.nextLine();
        
        for (i = 0; i < user_string.length(); i++) {
            
            // Contador de Vocales
            
            for (int j = 0; j < vowels.length(); j++) {
                if (user_string.charAt(i) == vowels.charAt(j)) {
                    counter_vowels++;
                }
            }
            
            // Contador de Caracteres especiales
            
            for (int k = 0; k < special_char.length(); k++) {
                if (user_string.charAt(i) == special_char.charAt(k)) {
                    counter_special_char++;
                }
            }
            
            // Contador de Numeros
            
            for (int h = 0; h < numbers.length(); h++) {
                if (user_string.charAt(i) == numbers.charAt(h)) {
                    counter_numbers++;
                }
            }
            
            // Contador de Espacios
            
            if (user_string.charAt(i) == ' ') {
                    counter_spaces++;
                }
        }
        
        counter_consonants = i - counter_vowels - counter_special_char - counter_spaces - counter_numbers;
        
        System.out.println("Contador de Vocales: " + counter_vowels);
        System.out.println("Contador de Caracteres Especiales: " + counter_special_char);
        System.out.println("Contador de Numeros: " + counter_numbers);
        System.out.println("Contador de Consonantes: " + counter_consonants);
        
    }
    
}
