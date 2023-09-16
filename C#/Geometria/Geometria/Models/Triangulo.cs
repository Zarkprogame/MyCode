using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometria.Models
{
    internal class Triangulo : FigurasGeometricas
    {
        public float semiperimetro { set; get; }
        public float Lado1 { set; get; }
        public float Lado2 { set; get; }
        public float Lado3 { set; get; }

        public Triangulo(float lado1, float lado2, float lado3)
        {
            Lado1 = lado1;
            Lado2 = lado2;
            Lado3 = lado3;
        }

        public override void CalcularArea()
        {
            semiperimetro = (Lado1 + Lado2 + Lado3) / 2;
            area = (float)Math.Sqrt(semiperimetro* (semiperimetro - Lado1)*(semiperimetro - Lado1)*(semiperimetro - Lado1));
        }
    }
}
