using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Triangulo_GUI.Models{
    internal class Triangulo{
        public static int area { set; get; }
        public static int @base { set; get; }
        public static int altura { set; get; }

        public Triangulo() {
            area = 0;
            altura = 0;
            @base = 0;
        }
        public void calcuraArea() { 
            area = (@base * altura) / 2;
        }
    }
}
