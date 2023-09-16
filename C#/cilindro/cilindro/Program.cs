using cilindro.models;

internal class Program
{
    private static void Main(string[] args)
    {

        double radio, altura;

        Operaciones cilindro1 = new Operaciones();    

        Console.WriteLine("Calcular Area y Volumen de un cilindro en Centimetros!");

        Console.Write("Para empezar proporcioname el Radio del Cilindro: ");
        radio = double.Parse(Console.ReadLine());

        Console.Write("Ahora la altura: ");
        altura = double.Parse(Console.ReadLine());

        cilindro1.calcularVolumen(radio,altura);
        cilindro1.calcularArea(radio, altura);
    }
}