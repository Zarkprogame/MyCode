using Planeacion_Agregada.Models;

internal class Program
{
    private static void Main(string[] args)
    {
        FuerzaLaboralConstante pract1 = new FuerzaLaboralConstante();

        pract1.crearMatrizInicial();
        pract1.calcularNumeroTrabajadores();
    }
}