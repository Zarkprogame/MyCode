using Electronica;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine(" Datos del Circuito: ");

        Circuitos circuito1 = new Circuitos();

        Console.Write("Escribe el Valor de la Resistencia 1: ");
        circuito1.resistencia1 = float.Parse(Console.ReadLine());

        Console.Write("Escribe el Valor de la Resistencia 2: ");
        circuito1.resistencia2 = float.Parse(Console.ReadLine());

        Console.Write("Escribe el Valor de la Resistencia 3: ");
        circuito1.resistencia3 = float.Parse(Console.ReadLine());

        Console.Write("Escribe el Valor de la Resistencia 4: ");
        circuito1.resistencia4 = float.Parse(Console.ReadLine());

        Console.Write("Escribe el Valor de la Resistencia 5: ");
        circuito1.resistencia5 = float.Parse(Console.ReadLine());

        circuito1.CalcularRt();

        Console.Write(" Para hallar la Potencia y la Corriente necesito el Voltaje, introducelo: ");
        circuito1.voltaje = float.Parse(Console.ReadLine());

        circuito1.CalcularP();

        circuito1.CalcularI();

        Console.WriteLine(" La Potencia de tu circuito es " + circuito1.Potencia + " y la Corriente es " + circuito1.Corriente + ". Fue Divertido!!");
        Console.WriteLine(" vuelve Pronto. ");
    }
}