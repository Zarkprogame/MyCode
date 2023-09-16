using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FiguraGeometrica.Model
{
    internal class Triangulo
    {
        public float area { set; get; }
        public float @base { set; get; }
        public float altura { set; get; }


        public Triangulo(){
            this.altura = 0;
            this.@base = 0;
            this.area = 0;
        }

        public void calcularArea() { 
            area = @base * altura / 2;
        }

    }
}
