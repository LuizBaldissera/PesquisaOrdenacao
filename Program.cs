using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace System
{
    internal class Program
    {
        public static void Main(string[] args)
        {
           
            List<int> listaBolha = new List<int>();
            List<int> listaInsercao = new List<int>();
            List<int> listaSelecao = new List<int>();
            long tempoInicio, tempoFim;  
        
            Console.Write("Quantidade números: ");
            int qtd = Int32.Parse(Console.ReadLine());

            Util.popularLista(listaBolha, qtd);
            Util.popularLista(listaInsercao, qtd);
            Util.popularLista(listaSelecao, qtd);
            
            Stopwatch sw = new Stopwatch();
            
            sw.Start();
            Ordenacao.insercao(listaInsercao);
            sw.Stop();
            Console.WriteLine("Fim do insercao (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();
            
            sw.Start();
            Ordenacao.insercao(listaBolha);
            sw.Stop();
            Console.WriteLine("Fim do Bolha (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();
            
            sw.Start();
            Ordenacao.insercao(listaSelecao);
            sw.Stop();
            Console.WriteLine("Fim do Selecao (ms): " + sw.ElapsedMilliseconds);
            sw.Reset();
            
            


        
           
        }
    }
}