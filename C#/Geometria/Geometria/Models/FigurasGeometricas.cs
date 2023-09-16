using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometria.Models
{
    internal abstract class  FigurasGeometricas
    {
        public float area { set; get; }

        public FigurasGeometricas() {
            area = 0;
        }

        public abstract void CalcularArea();
    }
}
