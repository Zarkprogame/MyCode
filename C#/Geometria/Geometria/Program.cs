using Geometria.Models;
using System.Drawing;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Figuras Geometricas: ");
        Rectangulo rectangulo1 = new Rectangulo(5,10);
        Triangulo triangulo1 = new Triangulo(4,4,4);
        Circulo circulo1 = new Circulo(5);

        List<FigurasGeometricas> lista = new List<FigurasGeometricas>();
        lista.Add(circulo1);
        lista.Add(triangulo1);
        lista.Add(rectangulo1); 

        Console.WriteLine("Rectangulo");
        rectangulo1.CalcularArea();
        Console.WriteLine("Su Area es: " + rectangulo1.area);

        Console.WriteLine("Triangulo");
        triangulo1.CalcularArea();
        Console.WriteLine("Su Area es: " + triangulo1.area);

        Console.WriteLine("Circulo");
        circulo1.CalcularArea();
        Console.WriteLine("Su Area es: " + circulo1.area);

        Console.ReadKey();
    }
}