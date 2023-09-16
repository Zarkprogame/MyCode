using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cilindro.models
{
    internal class Operaciones
    {
        public double area { get; set; }
        public double volumen { get; set; }
        public Operaciones() { 
            area = 0;
            volumen = 0;

        }

        public void calcularVolumen(double r, double h) {
            volumen = Math.PI * Math.Pow(r, 2) * h;
            Console.WriteLine("El Volumen del Cilindro es: " + Math.Round(volumen, 2));
        }
        public void calcularArea(double r, double h) { 
            area = (2 * Math.PI * r * h) + (2 * Math.PI * Math.Pow(r,2));
            Console.WriteLine("El Area del Cilindro es: " + Math.Round(area, 2));
        }
    }
}
