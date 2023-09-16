using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometria.Models
{
    internal class Rectangulo : FigurasGeometricas
    {
        public float Lado1 { set; get; }
        public float Lado2 { set; get;}

        public Rectangulo(float lado1, float lado2){
            Lado1 = lado1;
            Lado2 = lado2;
        }

        public override void CalcularArea()
        {
            area = Lado1 * Lado2;   
        }
    }

    
}
