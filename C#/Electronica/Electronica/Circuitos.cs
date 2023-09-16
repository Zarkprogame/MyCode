using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Electronica
{
    internal class Circuitos
    {
        public float voltaje { set; get; }
        public float resistencia1 { set; get; }
        public float resistencia2 { set; get; }
        public float resistencia3 { set; get; }
        public float resistencia4 { set; get; }
        public float resistencia5 { set; get; }
        public float Potencia { set; get; }
        public float Corriente { set; get; }
        public float Rt { set; get; }

        public Circuitos() {
            this.voltaje = 0.0f;
            this.resistencia1 = 0.0f;
            this.resistencia2 = 0.0f;
            this.resistencia3 = 0.0f;
            this.resistencia4 = 0.0f;
            this.resistencia5 = 0.0f;
            this.Potencia = 0.0f;
            this.Corriente = 0.0f;
            this.Rt = 0.0f;
        }

        public void CalcularRt() { 
            Rt = 1 / ((1/resistencia1) + (1/resistencia2) + (1/resistencia3) + (1/resistencia4) + (1/resistencia5));
        }

        public void CalcularP() {
            Potencia = voltaje / Rt;
        }
        public void CalcularI() {
            Corriente = voltaje * voltaje / Rt;
        }

    }
}
