using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Planeacion_Agregada.Models
{
    internal class FuerzaLaboralConstante
    {
        public int[,] matriz;
        public int NumeroMes { set; get; }
        public int ValorRequerimientos { set; get; }
        public int DiasLaborales { set; get; }
        public double NumeroTrabajadores { set; get; }
        public int DemandaAcumulada { get; set; }
        public int TiempoProceso { set; get; }
        public int DiasProduccion { set; get; }
        public int HorasLaboralesDia { set; get; }

        public FuerzaLaboralConstante(){
            NumeroMes = 0;
            ValorRequerimientos = 0;
            DiasLaborales = 0;
            matriz = new int[6,3];
            DemandaAcumulada = 0;
            TiempoProceso = 5;
            DiasProduccion = 0;
            HorasLaboralesDia = 8;
            NumeroTrabajadores = 0;
        }

        public void crearMatrizInicial() {
            for (int i = 0; i <= 5; i++){
                matriz[i, 0] = i + 1;
                Console.Write("Ingresa el valor de los Requerimientos del mes " + (i + 1) + ": ");
                matriz[i, 1] = int.Parse(Console.ReadLine());
                Console.Write("Ingresa el numero de dias laborales del mes " + (i + 1) + ": ");
                matriz[i, 2] = int.Parse(Console.ReadLine());
                
            }
            //for (int i = 0; i <= 5; i++)
            //{
            //    for (int j = 0; j <= 2; j++)
            //    {
            //        Console.WriteLine(matriz[i, j]);
            //    }
            //}
        }
        public void calcularNumeroTrabajadores()
        {
            for (int i = 0; i <= 5; i++)
            { // calcular demanda acumulada y dias del plan de produccion
                DemandaAcumulada += matriz[i, 1];
                DiasProduccion += matriz[i, 2];
            }

            NumeroTrabajadores = Math.Round((DemandaAcumulada * TiempoProceso) / (DiasProduccion * HorasLaboralesDia));
            Console.WriteLine(NumeroTrabajadores);
        }
    }
}
