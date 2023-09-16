using Torno.models;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Desviacion Estandar!");
        DesviacionEstandar prueba =  new DesviacionEstandar();
        prueba.crearLista();
        prueba.calcularMedia();
        prueba.calcularVarianza();
        prueba.calcularDesviacionEstandar();
    }
}