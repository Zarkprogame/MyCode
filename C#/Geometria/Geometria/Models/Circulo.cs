using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometria.Models
{
    internal class Circulo : FigurasGeometricas
    {
        public float Radio { set; get; }

        public Circulo(float radio)
        {
            Radio = radio;
        }

        public override void CalcularArea()
        {
            area = (Radio * Radio) * 3.1416f;
        }
    }
}
