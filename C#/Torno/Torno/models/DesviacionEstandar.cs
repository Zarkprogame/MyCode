using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Torno.models
{
    internal class DesviacionEstandar
    {
        public int numList { get; set; }
        public int media { get; set; }
        public double desviaciones { get; set; }
        public double varianza { get; set; }
        public double desviacionEstandar { get; set; }

        public List<int> numeros;

        public DesviacionEstandar()
        {
            numList = 0;
            media = 0;
            desviaciones = 0;
            varianza = 0;
            desviacionEstandar = 0;
            numeros = new List<int>();  
        }

        public void crearLista() {
            for (int i = 1; i <= 5; i++)
            {
                Console.Write("Ingresa el valor " + i + " de la investigacion: ");
                numList = int.Parse(Console.ReadLine());
                numeros.Add(numList);
            }
        }
        public void calcularMedia()
        {
            media = numeros.Sum() / numeros.Count;
            Console.WriteLine("La Media de la investigacion es: " + media);
        }
        public void calcularVarianza()
        {
            for (int i = 0; i < 5; i++) {
                desviaciones += Math.Pow((numeros[i] -media), 2);
            }
            varianza = desviaciones / numeros.Count;
            Console.WriteLine("La Varianza de la investigacion es: " + varianza);
        }
        public void calcularDesviacionEstandar()
        {
            desviacionEstandar = Math.Round(Math.Sqrt(varianza),2) ;
            Console.WriteLine("La Desviacion Estandar de la investigacion es: " + desviacionEstandar);
        }
    }
    
}
