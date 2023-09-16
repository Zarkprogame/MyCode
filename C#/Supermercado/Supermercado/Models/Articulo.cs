using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Supermercado.Models
{
    internal class Articulo
    {
        public int Emn { get; set; } // Existencia Minima
        public int Emx { get; set; } // Existencia Maxima
        public int Pp { get; set; } // Punto de pedido
        public int CP { get; set; } // Cantidad de Pedido

        public Articulo() { 
            Emn = 0;
            Emx = 0;
            Pp = 0;
            CP = 0;
        }

        public void calcularEmn(int cmn, int tr) { 
            Emn = cmn * tr;
        }
        public void calcularEmx(int cmx, int tr){
            Emx = (cmx * tr) + Emn;
        }
        public void calcularPp(int cp, int tr){
            Pp = (cp * tr) + Emn;   
        }
        public void calcularCP(int e)
        {
            CP = Emx - e;
        }
    }
}
