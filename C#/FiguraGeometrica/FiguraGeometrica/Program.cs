using FiguraGeometrica.Model;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Datos del Triangulo: ");

        Triangulo triangulo1 = new Triangulo();
        
        Console.Write("Escriba la base del triangulo: ");
        triangulo1.altura = float.Parse(Console.ReadLine());
        Console.Write("Escribe la altura del triangulo: ");
        triangulo1.@base = float.Parse(Console.ReadLine());
        triangulo1.calcularArea();
        Console.WriteLine("El area del Triangulo es: " + triangulo1.area);


    }
}