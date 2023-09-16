using Supermercado.Models;

internal class Program
{
    private static void Main(string[] args)
    {
        Articulo articulo = new Articulo();

        String nomProduct;
        int sumDay, conMax, conMin, venProm, cantBod;

        Console.Write("Bienvenido al sistema de Inventario. Ingresa el Nombre de tu producto: ");
        nomProduct = Console.ReadLine();

        Console.WriteLine("Producto: " + nomProduct);

        Console.Write("Cada cuanto se Sumunistra tu producto(dias): ");
        sumDay = int.Parse(Console.ReadLine());

        Console.Write("Ahora dime cuanto vendiste en el dia de mayor Consumo: ");
        conMax = int.Parse(Console.ReadLine());

        Console.Write("Ahora dime cuanto vendiste en el dia de menor Consumo: ");
        conMin = int.Parse(Console.ReadLine());

        Console.Write("Ahora dime cuanto fue la Venta Promedio: ");
        venProm = int.Parse(Console.ReadLine());

        Console.Write("Ahora dime la cantidad de este articulo en Bodega: ");
        cantBod = int.Parse(Console.ReadLine());

        articulo.calcularEmn(conMin, sumDay);

        articulo.calcularEmx(conMax,sumDay);

        articulo.calcularPp(venProm, sumDay);

        articulo.calcularCP(cantBod);

        Console.WriteLine("Resumen");

        Console.WriteLine("La existencia de " + nomProduct + " debe de ser entre " + articulo.Emn + " y " + articulo.Emx );
        Console.WriteLine("El Punto de Pedido debe de ser cuando tengas " + articulo.Pp + " cantidad de " + nomProduct);
        Console.WriteLine("La Cantidad del Pedido deben de ser: " + articulo.CP);
        Console.WriteLine("Datos tenidos en cuenta que el suministro de tu producto es cada " + sumDay + " Dias.");
    }
}