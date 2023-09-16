using System;

namespace Cuadratica
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a, b, c;
            String formula, signo, signo2;
            double raiz1, raiz2;

            Console.WriteLine("Ingresa el valor de a: ");
            a = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingresa el valor de b: ");
            b = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingresa el valor de c: ");
            c = int.Parse(Console.ReadLine());

            if (a > 0 || b > 0 || c > 0) {
                signo = "+";
                signo2 = "+";
            }
            else{
                signo = "";
                signo2 = "";
            }
                    
            formula = a + "x**2 " + signo + " " + b + "x " + signo2 + " " + c + " = 0";  
            Console.WriteLine("La formula cuadratica es igual a: " + formula);

            raiz1 = (-b + Math.Pow((b * b) - (4 * a * c),0.5)) / (2 * a);
            raiz2 = (-b - Math.Pow((b * b) - (4 * a * c), 0.5)) / (2 * a);

            Console.WriteLine("La primera solucion: " + raiz1);
            Console.WriteLine("La segunda solucion: " + raiz2);

            Console.ReadKey();
        }
    }
}
