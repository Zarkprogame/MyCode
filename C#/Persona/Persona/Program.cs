
using Persona.Model;
namespace Persona {
    public class Program{
        static void Main(string[] args)
        {
            Console.WriteLine("Datos de Persona: ");

            Personas person1 = new Personas();

            Console.Write("Escribe el Nombre: ");
            person1.Nombre = Console.ReadLine();
            Console.Write("Escribe el Apellido: ");
            person1.Apellido = Console.ReadLine();
            Console.Write("Escribe la Edad: ");
            person1.Edad = byte.Parse(Console.ReadLine());
            Console.WriteLine(person1.Nombre + " " + person1.Apellido + " tiene " + person1.Edad + " años");
        }
    }
}