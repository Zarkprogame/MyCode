using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Persona.Model
{
    public class Personas
    {
        public string Nombre { get; set; }
        public string Apellido { get; set; }
        public byte Edad { get; set; }

        public Personas() {
            this.Nombre = string.Empty;
            this.Apellido = string.Empty;
            this.Edad = 0;
        }

    }
}
